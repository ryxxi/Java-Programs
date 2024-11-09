import java.util.Scanner;

public class TeacherGradebook { 

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many students took the exam?");
		int students = input.nextInt();

		int[] scores = new int[students];

		for (int index = 0; index < students; index++) {

			System.out.print("Enter student " + (index+1) + "'s score: ");
			int score = input.nextInt();

			if (score >= 0 && score <= 100) {

				scores[index] = score;

			}

			else {

				System.out.println("Invalid input. Restart");
				break;

			}

		}

		int[] scoreBoundaries = new int[10];

		for (int index = 0; index < 10; index++) {

			for (int score : scores) {

				if (score > (0 + (index * 10)) && score < (9 + (index * 10))) {

					scoreBoundaries[index]++;

				}

			}

		}

		for (int score : scores) {

			if (score == 100) scoreBoundaries[9]++;

		}

		for (int index = 0; index < 9; index++) {

			System.out.print((0 + (index * 10)) + "-" + (9 + (index * 10)) + ": ");

			for (int counter = 0; counter < scoreBoundaries[index]; counter++) {

				System.out.print("*");

			}

			System.out.println();

		}

		for (int index = 9; index < 10; index++) {

			System.out.print((0 + (index * 10)) + "-" + (10 + (index * 10)) + ": ");

			for (int counter = 0; counter < scoreBoundaries[index]; counter++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}