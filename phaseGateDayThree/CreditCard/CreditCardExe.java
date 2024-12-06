import java.util.Scanner;

public class CreditCardExe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Credit Card Number:");
		String cardNumber = input.nextLine();

		CreditCard run = new CreditCard(cardNumber);
		run.printCardDetails(cardNumber);
	}
}