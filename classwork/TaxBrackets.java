import java.util.Scanner;

public class TaxBrackets {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter annual income: ");
		double income = input.nextDouble();

		if (income >=85526) System.out.println("24% tax");
		else if (income > 40126) System.out.println("22% tax");
		else if (income > 9876) System.out.println("12% tax");
		else System.out.println("10%");

	}

}
