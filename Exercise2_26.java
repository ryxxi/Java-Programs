import java.util.Scanner;

public class Exercise2_26 {

	public static void main(String... args) { 

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first integer: ");
		int integer1 = input.nextInt();

		System.out.print("Enter your second integer: ");
		int integer2 = input.nextInt();

		int tripled = integer1 * 3;
		int doubled = integer2 * 2;
		int remainder = tripled % doubled;

		if (remainder == 0) {
		System.out.println("Your first integer tripled is a multiple of your second integer doubled");
		}
		else {
		System.out.println("Your first integer tripled is not a multiple of your second integer doubled");
		}

	}

}