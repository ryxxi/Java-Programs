import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 3 digit integer: ");
		int number1 = input.nextInt();

		int digit1 = number1 / 100;

		int digit3 = number1 % 10;

		if (digit1 == digit3) {
		System.out.println("Your number is a palindrome");
		}

		if (digit1 != digit3) {
		System.out.println("Your number is not a palindrome");
		}

	}

}