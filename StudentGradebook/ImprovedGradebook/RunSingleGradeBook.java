import java.util.Scanner;

public class RunSingleGradeBook {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int students = input.nextInt();

		int[] grades = new int[students];

		for (int student = 1; student <= students; student++) {

			System.out.printf("Enter student %d's grade: ", student);
			int grade = input.nextInt();

			grades[student - 1] = grade;

		}

		TerminalClear.clearTerminal();

		SingleGradeBook myGradeBook = new SingleGradeBook("Java 101 Winter Exams", grades);
		System.out.printf("Opening Grade Book for%n%s%n", myGradeBook.getCourseName());

		myGradeBook.processGrades();

	}

}

		