import java.util.Scanner;

public class CheckoutExe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter customer's name:");
		String customerName = input.nextLine();
		
		Checkout checkout = new Checkout(customerName);

		checkout.processItems();

	}

}

		