import java.util.Scanner;

public class ATMExe {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			String action = bankPrompt();
			input.nextLine();
		
			if (action.toUpperCase().equals("X")) break;

			switch(action) {
				case "1":
					System.out.println("Input account number");
					String accountNumber = input.nextLine();

					System.out.println("Input pin");
					String pin = input.nextLine();

					new ATM(pin, accountNumber);
					break;

				case "2":
					ATM atm = new ATM();
					atm.openAccount();
					break;

				default:
					System.out.println("Invalid input, try again");
			}
		}
	}

	public static String bankPrompt() {

		System.out.print("""

		Welcome to Banke Bank!

		Select:

		1. Login
		2. Open an account

		Type 'X' to exit

		""");
		return input.nextLine();

	}
}



























