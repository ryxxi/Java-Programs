import java.util.Scanner;

public class AccountTest { 

	public static void main(String[] args) {

		Account account = new Account();

		Scanner input = new Scanner(System.in);

		System.out.print("Input name of account holder: ");
		String userName = input.nextLine();

		account.setName(userName);
		System.out.println();

		System.out.printf("Welcome %s%n%n", account.getName());

		System.out.print("What would you like to do: Withdraw(W) or Deposit(D)?: ");
		String rawUserChoice = input.nextLine();

		if (rawUserChoice.length() == 1 && Character.isLetter(rawUserChoice.charAt(0))) {
			char realUserChoice = Character.toUpperCase(rawUserChoice.charAt(0));
			if (realUserChoice == 'W') {
				System.out.print("State desired amount to withdraw:\n£10\n£20\n£30\n£50\n£70\n£100\nOther\nReturn\n");
				String rawWithdrawChoice = input.nextLine();
				switch (rawWithdrawChoice) {
					case "£10":
						System.out.println("Please wait as we prepare your money...");
						break;

					case "£20":
						System.out.println("Please wait as we prepare your money...");
						break;

					case "£30":
						System.out.println("Please wait as we prepare your money...");
						break;

					case "£50":
						System.out.println("Please wait as we prepare your money...");
						break;

					case "£70":
						System.out.println("Please wait as we prepare your money...");
						break;

					case "£100":
						System.out.println("Please wait as we prepare your money...");
						break;

					case "Other":
						System.out.println("Please wait...");
						break;

					case "Return":
						System.out.print("What would you like to do: Withdraw(W) or Deposit(D)?: ");
						rawUserChoice = input.nextLine();
						break;

				}
			}

		}

		

	}

}