import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Guess a number between 0 and 100(inclusive: ");
		int guess = input.nextInt();

		int number = 73;

		if (guess != number) System.out.println("Incorrect!");
		else System.out.println("Correct!");

	}

}

