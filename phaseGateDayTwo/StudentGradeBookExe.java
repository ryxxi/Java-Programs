import java.util.Scanner;

public class StudentGradeBookExe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input course name:");
		String courseName = input.nextLine();

		System.out.println("How many students sat these exams?");
		int students = input.nextInt();

		System.out.println("How many exams were sat?");
		int exams = input.nextInt();

		StudentGradeBook run = new StudentGradeBook(courseName, students, exams);

		run.gradeBook();

	}

}

		

		