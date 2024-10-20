import java.util.Scanner;

public class SumLoopChoice { 

	public static void main(String[] args) { 

		Scanner input = new Scanner(System.in);
		String choice = " ";

		System.out.print("Do you wish to execute this operation?(Y/N): ");
		choice = input.next();

		do {

		System.out.print("Enter first integer: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second integer: ");
		double number2 = input.nextDouble();

		double sum = number1 + number2;

		System.out.printf("Sum of numbers is %.1f%n", sum);

		System.out.print("Do you wish to repeat this operation?(Y/N): ");
		choice = input.next();

		} while (choice.equals("Y"));

	}

}