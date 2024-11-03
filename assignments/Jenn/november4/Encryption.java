import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 4 digit integer for encryption: ");
		int integer = input.nextInt();

		int digit1 = integer / 1000;
		int digit2 = integer / 100 % 10;
		int digit3 = integer / 10 % 10;
		int digit4 = integer % 10;

		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;

		System.out.printf("%d%d%d%d%n", digit3, digit4, digit1, digit2);

	}

}
