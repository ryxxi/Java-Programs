import java.util.Scanner;

public class CheckIfPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 5-digit integer: ");
		String number = input.nextLine();

		checkIfPalindrome(number);

	}

	public static void checkIfPalindrome(String string) {

		boolean isPalindrome = false;
		String reverse = "";

		for (int index = 0; index < string.length(); index++) {

			reverse += string.charAt(string.length() - 1 - index);

		}

		if (reverse.equals(string)) isPalindrome = true;

		System.out.print(isPalindrome?"It is a palindrome\n":"It isn't a palindrome\n");

	}

}