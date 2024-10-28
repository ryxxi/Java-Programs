import java.util.Scanner;

public class LargeAndSmall {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number, or type -1 to end: ");
		double number = input.nextDouble();
		double largest = number;
		double smallest = number;

		while (number != -1) {

		System.out.print("Input a number, or type -1 to end: ");
		number = input.nextDouble();

			if (number > largest) largest = number;
			if (number < smallest) smallest = number;

		}

		System.out.printf("Largest: %f%nSmallest: %f%n", largest, smallest);

	}

}
		