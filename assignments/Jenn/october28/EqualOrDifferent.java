import java.util.Scanner;

public class EqualOrDifferent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first floating point number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second floating point number: ");
		double number2 = input.nextDouble();

		int comparison = Double.compare(number1, number2);

		if (comparison == 0) System.out.println("They are equal");
		else System.out.println("They are not equal");

	}

}

		