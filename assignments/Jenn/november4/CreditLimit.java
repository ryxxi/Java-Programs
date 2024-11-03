import java.util.Scanner;

public class CreditLimit {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.print("Enter account number: ");
		long accountNumber = input.nextInt();

		System.out.print("Enter balance at beginning of the month: ");
		double initialBalance = input.nextDouble();

		System.out.print("Enter total charge from this month: ");
		double totalCharge = input.nextDouble();

		System.out.print("Enter total applied credit from this month: ");
		double appliedCredit = input.nextDouble();

		System.out.print("Enter credit limit: ");
		double creditLimit = input.nextDouble();

		double newBalance = initialBalance + totalCharge - appliedCredit;

		System.out.println("New balance is: $" + newBalance);

		if (newBalance > creditLimit) System.out.println("Credit limit exceeded");

	}

}