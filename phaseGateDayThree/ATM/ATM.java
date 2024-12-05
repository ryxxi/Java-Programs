import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;

public class ATM {

	private SecureRandom rand = new SecureRandom();
	private Scanner input = new Scanner(System.in);
	private ArrayList<Double> balances = new ArrayList<>();
	private ArrayList<String> accountHolders = new ArrayList<>();
	private ArrayList<String> pins = new ArrayList<>();
	private ArrayList<String> accountNumbers = new ArrayList<>();

	public ATM(String pin, String accountNumber) {
		initialiseTestData();
		if (accountExists(pin, accountNumber)) {
			try {
				System.out.printf("You're logging in %s", getAccountHolder(accountNumber));
				Thread.sleep(1500);
				accountActions(accountNumber);
				return;

			} catch (InterruptedException e) {
				System.out.println("Login Interrupted");
			}
		}

		System.out.println("Account not found\n");
		System.out.println("Select:\n\n1. Enter account details again\n2. Open a new account\n\nEnter anything else to quit");

		switch (input.nextLine()) {
			case "1":
				clear();
				redoLogin();
				break;

			case "2":
				clear();
				openAccount();
				break;

			default:
				System.out.println("Goodbye");
				break;
		}
	}

	public ATM() {
		initialiseTestData();
	}

	public void redoLogin() {
		System.out.println("Input account number");
		String accountNumber = input.nextLine();

		System.out.println("Input pin");
		String pin = input.nextLine();

		new ATM(pin, accountNumber);
	}

	public boolean accountExists(String pin, String accountNumber) {
		if (accountNumbers.contains(accountNumber)) {
			int index = accountNumbers.indexOf(accountNumber);
			return pins.get(index).equals(pin);
		}
		return false;
	}

	public void openAccount() {
		System.out.println("You are opening an account with Banke Bank");

		while (true) {
			System.out.println("Enter first and last name:");
			String accountHolder = input.nextLine();

			System.out.println("Create a 6-digit pin");
			String pin = input.nextLine();

			if (isPinValid(pin)) {
				accountHolders.add(accountHolder);
				balances.add(0.00);
				pins.add(pin);
				String accountNumber = generateAccountNumber();
				accountNumbers.add(accountNumber);

				System.out.printf("Account Opened!%n%nYour account number is %s", accountNumber);
				accountActions(accountNumber);
			}
			clear();
			System.out.println("Your pin is invalid, try again");
		}
	}

	public boolean isPinValid(String pin) {
		if (pin.length() != 6) return false;
		for (char ch : pin.toCharArray()) {
			if (!Character.isDigit(ch)) return false;
		}

		return true;
	}


	public String generateAccountNumber() {
		String numbers = "1234567890";
		String accountNumber;

		while (true) {
			accountNumber = "";
			for (int digit = 0; digit < 9; digit++) {
				int index = rand.nextInt(numbers.length());
				accountNumber += numbers.charAt(index);
			}
			if (!accountNumbers.contains(accountNumber)) break;
		}

		return accountNumber;
	}

	public String getAccountHolder(String accountNumber) {
		int accountIndex = accountNumbers.indexOf(accountNumber);
		return accountHolders.get(accountIndex);
	}

	public void accountActions(String accountNumber) {
		while (true) {
			clear();			
			
			System.out.printf("Welcome %s!%n", getAccountHolder(accountNumber));
			System.out.println("\nSelect an action:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer to another Account");
			System.out.println("5. Change Pin");
			System.out.println("6. Close Account");
			System.out.println("7. Logout");

			String action = input.nextLine();
			int index = accountNumbers.indexOf(accountNumber);

			switch (action) {
				case "1":
					System.out.printf("Your Account Balance is %.2f%n", balances.get(index));
					System.out.println("Enter anything to return");
					
					while (true) {
						if (input.nextLine().isEmpty() || !input.nextLine().isEmpty()) break;
					}
					break;
					
				case "2":
					System.out.println("Enter amount to deposit:");
					double deposit = input.nextDouble();
					balances.set(index, balances.get(index) + deposit);

					System.out.printf("Succesfully deposited %.2f%n", deposit);
					System.out.printf("Updated Balance: %.2f", balances.get(index));
					delay(2500);
					break;

				case "3":
					System.out.println("Enter amount to withdraw:");
					double withdraw = input.nextDouble();

					if (withdraw > balances.get(index)) {
						System.out.println("Insufficient Funds");
						delay(2000);
					}

					else {
						balances.set(index, balances.get(index) - withdraw);
						System.out.printf("Succesfully withdrew %.2f%n", withdraw);
						System.out.printf("Updated Balance: %.2f", balances.get(index));
						delay(2500);
					}
					break;

				case "4":
					System.out.println("Enter Receiver's Account Number:");
					String receivingAccountNumber = input.nextLine();
					System.out.println("Enter Amount to Transfer");
					double amount = input.nextDouble();
					transfer(accountNumber, receivingAccountNumber, amount);
					break;

				case "5":
					changePin(accountNumber);
					break;

				case "6":
					if (closeAccount(accountNumber)) return;
					break;

				case "7":
					System.out.print("Logging out");
					for (int i = 0; i < 3; i++) {
						System.out.print("...");
						delay(1000);
					}
					return;					

				default:
					System.out.print("Invalid input");
			}
		}
	}

	public void transfer(String senderAccountNumber, String receiverAccountNumber, double amount) {
		if (!accountNumbers.contains(senderAccountNumber)) {
			System.out.println("Account Not Found");
			return;
		}

		if (!accountNumbers.contains(receiverAccountNumber)) {
			System.out.println("Account Not Found");
			return;
		}

		int senderIndex = accountNumbers.indexOf(senderAccountNumber);
		int receiverIndex = accountNumbers.indexOf(receiverAccountNumber);

		if (amount > balances.get(senderIndex)) {
			System.out.println("Insufficient Funds");
			delay(2000);
			return;
		}

		input.nextLine();
		for (int attempt = 1; attempt <= 5; attempt++) {
			System.out.println("Enter your pin:");
			String pinAttempt = input.nextLine();

			if (!pins.get(senderIndex).equals(pinAttempt)) {
				if (attempt != 5) System.out.println("Incorrect Pin, try again");
				if (attempt == 2) System.out.println("3 Attempts Remaining");
				if (attempt == 3) System.out.println("2 Attempts Remaining");
				if (attempt == 4) System.out.println("1 Attempt Remaining");
				if (attempt == 5) {
					System.out.println("No Attempts Remaining");
					System.out.println("Call 05839286427 to go about resetting you pin");
					delay(1500);
					return;
				}
			}

			else {
				delay(2500);
				break;
			}
		}
			

		balances.set(senderIndex, balances.get(senderIndex) - amount);
		balances.set(receiverIndex, balances.get(receiverIndex) + amount);

		System.out.println("Transfer successful!");
		System.out.printf("Updated Balance: $%.2f%n", balances.get(senderIndex));
		delay(2000);
	}

	public void changePin(String accountNumber) {
		int index = accountNumbers.indexOf(accountNumber);

		for (int attempt = 1; attempt <= 5; attempt++) {
			System.out.println("Enter you current pin:");
			String pinAttempt = input.nextLine();

			if (!pins.get(index).equals(pinAttempt)) {
				if (attempt != 5) System.out.println("Incorrect Pin, try again");
				if (attempt == 2) System.out.println("3 Attempts Remaining");
				if (attempt == 3) System.out.println("2 Attempts Remaining");
				if (attempt == 4) System.out.println("1 Attempt Remaining");
				if (attempt == 5) {
					System.out.println("No Attempts Remaining");
					System.out.println("Call 05839286427 to go about resetting your pin");
					delay(1500);
					return;
				}
			}

			else {
				delay(2500);
				break;
			}
		}

		System.out.println("Enter your new pin:");
		String newPin = input.nextLine();

		System.out.println("Confirm your new pin");
		String confirmPin = input.nextLine();

		if (newPin.equals(confirmPin) && isPinValid(newPin)) {
			pins.set(index, newPin);
		}
	}

	public boolean closeAccount(String accountNumber) {
		int index = accountNumbers.indexOf(accountNumber);

		System.out.println("Do you wish to close your account?");
		System.out.println("This action is irreversible");
		System.out.println("Type 'Y' to proceed, or anything else to return");
		String choice = input.nextLine();

		if (!choice.toUpperCase().equals("Y")) return false;

		System.out.println("Enter Account Holder's Full Name");
		String accountHolder = input.nextLine();

		System.out.println("Enter Pin:");
		String pin = input.nextLine();

		if (!accountHolders.get(index).equals(accountHolder) ||
		   !pins.get(index).equals(pin)) {
			System.out.println("Incorrect Account Details, try again later");
			delay(2000);
			return false;
		}

		System.out.println("This action is irreversible");
		System.out.println("Type 'Y' to proceed, or anything else to return");
		choice = input.nextLine();

		if (!choice.toUpperCase().equals("Y")) return false;

		accountNumbers.remove(index);
		accountHolders.remove(index);
		pins.remove(index);
		balances.remove(index);
		System.out.println("Account Closed. Goodbye");
		delay(2000);
		return true;
	}

	public void initialiseTestData() {
		accountHolders.add("Test Account");
		accountNumbers.add("12345678");
		balances.add(0.00);
		pins.add("123456");
	}
						
	public void clear() {
		System.out.print("\033[H\033[2J");
      		System.out.flush();
	}

	public void delay(int milliseconds) {
		try {
			Thread.sleep(milliseconds);

		} catch (InterruptedException e) {
			System.out.println("Error");
		}
	}

}

	
	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	