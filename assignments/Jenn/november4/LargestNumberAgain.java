import java.util.Scanner;

	public class LargestNumberAgain {

		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		int number = input.nextInt();
		int largest = number;

		int counter = 1;

		while (counter < 10) {
			System.out.print("Input a number: ");
			number = input.nextInt();

			if (number > largest) largest = number;

			counter++;
		}

		System.out.printf("The largest number is %d%n", largest);

	}

}