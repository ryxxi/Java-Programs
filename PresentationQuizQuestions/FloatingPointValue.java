import java.util.Scanner;

public class FloatingPointValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a floating point value: ");
		double number = input.nextDouble();

		if (number > 0) System.out.print("Positive and ");
		else if (number < 0) System.out.print("Negative and ");
		else System.out.println("Your number is 0");

		if (number < -1000000 || number > 1000000) System.out.println("Large");
		else if ((number > -1000000 || number < 1000000) && number != 0) System.out.println("Small");

	}

}