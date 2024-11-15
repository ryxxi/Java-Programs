import java.util.Scanner;

public class StudentGradebook {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		TerminalClear clear = new TerminalClear();

		System.out.print("Enter the number of students: ");
		int students = input.nextInt();

		System.out.print("Enter the number of subjects the students sat: ");
		int subjects = input.nextInt();

		int[][] gradebook = new int[subjects][students];
		int score = 0;

		System.out.print("Opening gradebook");

		try {
			for (int i = 0; i < 3; i++) {
				System.out.print("...");
				Thread.sleep(750);

			}
		}

		catch (InterruptedException e) {

			e.printStackTrace();
			System.out.println("Error occurred");

		}

 		clear.clearTerminal();

		try {

		for (int subject = 1; subject < subjects + 1; subject++) {

			for (int student = 1; student < students + 1; student++) {

				System.out.printf("Enter student %d's score for subject %d: ", student, subject);
				score = input.nextInt();

				gradebook[subject - 1][student - 1] = score;

				System.out.print("Saving score");

					for (int i = 0; i < 3; i++) {

						System.out.print("...");
						Thread.sleep(350);

					}

      				System.out.print("\033[H\033[2J");
      				System.out.flush();

			}

		}

		}

		catch (InterruptedException e) {

			e.printStackTrace();
			System.out.println("Error occurred");

		}

		System.out.print("Student\t");

		for (int number = 0; number < subjects; number++) {

			System.out.print("Subj " + (number + 1) + "\t");

		}

		System.out.println("Total\tMean");

		for (int asterisk = 0; asterisk < (23 + (7 * subjects)); asterisk++) {

			System.out.print("=");

		}

		int total = 0;
		double avg = 0;

		System.out.println();

		for (int student = 1; student < students + 1; student++) {
			
			System.out.print(student);

			for (int subject = 1; subject < subjects + 1; subject++) {

				total += gradebook[subject - 1][student - 1];

				System.out.print("\t" + gradebook[subject - 1][student - 1]);

			}

			avg = (double) total / subjects;
			
			System.out.print("\t" + total);
			System.out.printf("\t%.2f%n", avg);


			total = 0;
			avg = 0;

		}

		for (int asterisk = 0; asterisk < (23 + (7 * subjects)); asterisk++) {

			System.out.print("=");

		}

		System.out.println();

	}

}