import java.util.Scanner;

public class EvenSumBetween {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int integer1 = 0;
		int integer2 = 0;

		do {

		System.out.print("Enter 2 integers, with the second being the largest: ");
		integer1 = input.nextInt();
		integer2 = input.nextInt();

		} while (integer2 < integer1);

		int sum = 0;

		for (int number = integer1; number < integer2 + 1; number++) {
			if (number % 2 == 0) sum += number;
		}

		System.out.printf("The sum of even numbers between %d and %d is %d%n", integer1, integer2, sum);

	}

}