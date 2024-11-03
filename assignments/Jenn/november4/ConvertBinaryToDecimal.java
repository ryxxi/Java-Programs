import java.util.Scanner;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a binary number: ");
		String binary = input.next();

		int length = binary.length();

		Integer actualBinary = Integer.valueOf(binary);
		int decimal;
		int multiplier = 1;
		int lastDigit;
		int sum = 0;

		while (length > 0) {

			lastDigit = actualBinary % 10;
			sum += (lastDigit * multiplier);
			actualBinary /= 10;
			multiplier *= 2;
			length--;

		}

		System.out.printf("Decimal representation of binary %s is %d%n", binary, sum);

	}

}