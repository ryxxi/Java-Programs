// Read Chapter 14

import java.util.Scanner;

public class AccountInterface {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your desired action: Withdraw, Deposit, Balance");
		String literalResponse = input.nextLine();

		int integer1 = 10;
		int integer2 = 20;
		int integer3 = 30;
		int integer4 = 50;
		int integer5 = 80;
		int integer6 = 100;
		String literalOption = "Other";

		if (literalResponse .= "Withdraw") {

		System.out.printf("How much would you like to withdraw? : %d%n%d%n%d%n%d%n%d%n%d%n%s%n", integer1, integer2, integer3, integer4, integer5, integer6, literalOption);
		}

	}

}