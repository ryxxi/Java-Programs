import java.util.Scanner;

public class PalindromeFiveDigits { 

	public static void main(String[] args ) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive 5 digit integer: ");
		int number = input.nextInt();

		if (number < 100000 && number > 0) {
			int firstDigit = number / 10000;
			int secondDigit = (number / 1000) % 10;
			int fourthDigit = (number / 10) % 10;
			int fifthDigit = number % 10;

			if (firstDigit == fifthDigit && secondDigit == fourthDigit) System.out.printf("%n%d is a palindrome%n", number);
			else System.out.printf("%n%d is not a palindrome%n", number);

		}

	}

}