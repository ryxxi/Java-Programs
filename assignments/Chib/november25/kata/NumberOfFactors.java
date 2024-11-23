import java.util.Scanner;

public class NumberOfFactors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		getFactors(number);

	}

	public static void getFactors(int number) {

		int factorCount = 0;

		for (int count = 1; count < number + 1; count++) {

			if (number % count == 0) factorCount++;

		}

		System.out.printf("Number of factors: %d%n", factorCount);

	}

}