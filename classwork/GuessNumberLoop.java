import java.util.Scanner;
import java.util.Random;

public class GuessNumberLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Guess a number between 0 and 100(inclusive: ");
		int guess = input.nextInt();

		Random random = new Random();
		int number = random.nextInt(100);

		while (guess != number) {
			

			if (guess > number) System.out.println("Too high!");
			else System.out.println("Too low!");
			System.out.print("Guess again: ");
			guess = input.nextInt();
		}

		System.out.println("You got it!");

	}

}