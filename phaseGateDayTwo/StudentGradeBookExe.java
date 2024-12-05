import java.util.Scanner;

public class StudentGradeBookExe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String input1 = "";
		String input2 = "";
		String input3 = "";

		while (true) {

			System.out.println("Input course name:");
			input1 = input.nextLine();

			System.out.println("How many students sat these exams?");
			input2 = input.nextLine();

			System.out.println("How many exams were sat?");
			input3 = input.nextLine();

			if (isStudentsValid(input2) && isExamsValid(input3)) break;

		}

		String courseName = input1;
		int students = Integer.parseInt(input2);
		int exams = Integer.parseInt(input3);

		StudentGradeBook run = new StudentGradeBook(courseName, students, exams);

		run.gradeBook();

	}



	public static boolean isStudentsValid(String string) {

		int temp = 0;

		try {

			temp = Integer.parseInt(string);

		}

		catch (NumberFormatException e) {

			System.out.print("\033[H\033[2J");
      			System.out.flush();
			System.out.println("Invalid input, try again");
			return false;

		}

		if (temp > 0) return true;

		return false;

	}

	public static boolean isExamsValid(String string) {

		int temp = 0;

		try {

			temp = Integer.parseInt(string);

		}

		catch (NumberFormatException e) {

			System.out.print("\033[H\033[2J");
      			System.out.flush();
			System.out.println("Invalid input, try again");
			return false;

		}

		if (temp > 0) return true;

		return false;

	}

}

		

		