import java.util.Scanner;

public class StudentGradeBook {

	private String courseName;
	private int[][] grades;
	private int students;
	private int exams;
	private Scanner input = new Scanner(System.in);

	public StudentGradeBook(String courseName, int students, int exams) {

		this.courseName = courseName;
		this.students = students;
		this.exams = exams;
		grades = new int[students][exams];

	}

	public String getCourseName() {

		return courseName;

	}

	public void gradeBook() {

		grades = obtainGrades();

		outputGrades();

	}

	public int[][] obtainGrades() {

		for (int student = 1; student <= students; student++) {

			for (int exam = 1; exam <= exams; exam++) {

				System.out.printf("Enter Student %d's grade in Exam %d%n", student, exam);
				grades[student - 1][exam - 1] = input.nextInt();

			}

		}

		return grades;

	}

	public void displayAll() {

		outputGrades();

		printDoubleBars();
		printDoubleBars();

	}

	public void outputGrades() {

		System.out.println("Which subjects grades do you wish to see?");
		int subject = input.nextInt();

		System.out.printf("Subject %d Grades:%n", subject);

		for (int student = 1; students <= students; student++) {

			System.out.printf("Student %d: %2d%n", student, grades[student-1][subject-1]);

		}

		System.out.printf("Subject %d's total grade: %d", subject, getTotal(subject));

		System.out.printf("Subject %d's mean grade: %d", subject, getMean(subject));

		getHighestScorer(subject);

	}

	public int getTotal(int subject) {

		int total = 0;

		for (int student = 1; students <= students; student++) {

			total += grades[student-1][subject-1];

		}

		return total;

	}

	public double getMean(int subject) {

		double mean = (double) getTotal(subject) / students;

		return mean;

	}

	public void getHighestScorer(int subject) {

		int highestGrade = grades[0][subject];
		int bestStudent = 0;

		for (int student = 1; students <= students; student++) {

			if (grades[student][subject-1] > highestGrade) {

				highestGrade = grades[student][subject-1];
				bestStudent = student;

			}

		}

		System.out.printf("Subject %d's highest grade is %d, achieved by Student %d", subject, highestGrade, bestStudent);

	}

	public void printDoubleBars() {

		for (int i = 0; i < 50; i++) {

			System.out.print("=");

		}
		
		System.out.println();

	}

}
		
		












































	

	



























	

	










	

				