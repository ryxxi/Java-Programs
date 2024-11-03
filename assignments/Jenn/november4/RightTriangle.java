import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to determine the size of the right-angled triangle: ");
		int size = input.nextInt();

		int row = 0;

		for (row = 0; row < size + 1; row++) {

			for (int asterisk = 0; asterisk < row; asterisk++) System.out.print("*");

		System.out.println();

		}

	}

}

				