import java.util.Scanner;

public class DigitSums {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a postive integer: ");
		int integer = input.nextInt();
		int original = integer;
		
		int sum = 0;

		while (integer != 0) {
			sum += integer % 10;
			integer /= 10;
		}

		System.out.printf("The digit sum of %d is %d%n", original, sum);

	}

}