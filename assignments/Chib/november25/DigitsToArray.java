import java.util.Scanner;
import java.util.Arrays;

public class DigitsToArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String string = input.nextLine();

		changeToArray(string);

	}

	public static void changeToArray(String string) {

		char[] array = new char[string.length()];

		for (int index = 0; index < string.length(); index++) {

			array[index] = string.charAt(index);

		}

		System.out.println(Arrays.toString(array));

	}

}