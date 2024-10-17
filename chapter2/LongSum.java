import java.util.Scanner;

public class LongSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		System.out.print("Enter third number: ");
		double number3 = input.nextDouble();

		System.out.print("Enter fourth number: ");
		double number4 = input.nextDouble();

		System.out.print("Enter fifth number: ");
		double number5 = input.nextDouble();

		System.out.print("Enter sixth number: ");
		double number6 = input.nextDouble();

		double sum = number1 + (number2 / (number3 * number4)) - (number5 * number6);

		System.out.printf("Sum is %s%n", sum);

	}

}