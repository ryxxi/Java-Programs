import java.security.SecureRandom;

public class ArcheryGame {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();

		int[][] players = new int[4][3];

		int totalScore = 0;
		int winner = 0;
		int temp = 0;
		int largest = 0;

		System.out.println("Player\tScore1\tScore2\tScore3\tTotal");

		for (int player = 0; player < 4; player++) {

			System.out.print(player + 1);

			for (int score = 0; score < 3; score++) {

				int randomScore = random.nextInt(10);
				players[player][score] = randomScore;

				System.out.print("\t" + players[player][score]);

			}

			for (int score = 0; score < 3; score++) {

				temp += players[player][score];

				if (temp > largest) {

					largest = temp;
					winner = player + 1;

				}

				totalScore = temp;
	
			}

			System.out.println("\t" + totalScore);
			totalScore = 0;
			temp = 0;

		}

		System.out.printf("Player %d is the winner%n%n", winner);

	}

}