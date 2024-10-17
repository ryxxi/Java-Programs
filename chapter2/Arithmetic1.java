import java.util.Scanner;

public class Arithmetic1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st number: ");
		float number1 = input.nextFloat();

		System.out.print("Enter 2nd number: ");
		float number2 = input.nextFloat();

		System.out.print("Enter 3rd number: ");
		float number3 = input.nextFloat();

		System.out.print("Enter 4th number: ");
		float number4 = input.nextFloat();

		float sum = ((number1 - number2) * number3) / number4;

		System.out.printf("Sum is %f%n", sum);

	}

}