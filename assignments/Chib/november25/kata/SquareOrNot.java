import java.util.Scanner;

public class SquareOrNot {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		checkIfSquare(number);

	}

	public static void checkIfSquare(int number) {

		boolean isSquare = false;

		if (Math.sqrt(number) % 1 == 0) isSquare = true;

		System.out.println(isSquare?"It is a square number":"It isn't a square number");

	}

}