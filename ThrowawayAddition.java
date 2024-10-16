import java.util.Scanner;

public class ThrowawayAddition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer 1: ");
		int number1 = input.nextInt();

		System.out.print("Enter integer 2: ");
		int number2 = input.nextInt();

		int sum = number1 + number2;

		System.out.printf("Sum is %s%n", sum);

	}

}