import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 4 digit integer for decryption: ");
		int integer = input.nextInt();

		int digit1 = integer / 1000;
		int digit2 = integer / 100 % 10;
		int digit3 = integer / 10 % 10;
		int digit4 = integer % 10;

		digit1 = (digit1 + 10) - 7;
		digit2 = (digit2 + 10) - 7;
		digit3 = (digit3 + 10) - 7;
		digit4 = (digit4 + 10) - 7;

		if (digit1 > 10) digit1 = digit1 - 10;
		if (digit2 > 10) digit2 = digit2 - 10;
		if (digit3 > 10) digit3 = digit3 - 10;
		if (digit4 > 10) digit4 = digit4 - 10;

		System.out.printf("%d%d%d%d%n", digit3, digit4, digit1, digit2);

	}

}
