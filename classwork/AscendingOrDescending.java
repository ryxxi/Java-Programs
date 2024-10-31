import java.util.Scanner;

public class AscendingOrDescending {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 3 number: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		if (number1 < number2 && number2 < number3) System.out.println("Ascending Order");
		else if (number1 > number2 && number2 > number3) System.out.println("Descending Order");
		else System.out.println("Neither ascending nor descending");

	}

}