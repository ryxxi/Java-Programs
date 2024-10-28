import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNumber = random.nextInt(1000);

		Scanner input = new Scanner(System.in);

		System.out.print("Try and guess a random integer between 0 and 1000: ");
		int guess = input.nextInt();

		int guessCounter = 0;

		while (guess != randomNumber) {

			if (guess > randomNumber) {
				System.out.print("Nuh uh, too high! Try again: ");
				guess = input.nextInt();

			} else {
				System.out.print("Nuh uh, too low! Try again: ");
				guess = input.nextInt();

			}

		guessCounter++;

		}

		System.out.printf("Well done! You guessed correct in %d guesses!%n", guessCounter);

	}

}