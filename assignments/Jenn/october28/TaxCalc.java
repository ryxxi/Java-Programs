import java.util.Scanner;

public class TaxCalc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input name: ");
		String name = input.nextLine();

		System.out.print("Input annual income, in $: ");
		double income = input.nextDouble();

		double tax;

		if (income < 30000) tax = income * 0.15;
		else tax = income * 0.2;

		System.out.printf("Your total tax = $%.2f%n", tax);

	}

}