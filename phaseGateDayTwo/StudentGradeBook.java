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

		displayAll();

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

		String userChoice = "";

		do {
			
			outputGrades();

			input.nextLine();
			System.out.println("Would you like to see another subject's grades?(Y/N)");
			userChoice = input.nextLine();

		} while (userChoice.toUpperCase().charAt(0) == 'Y');

	}

	public void outputGrades() {

			System.out.print("\033[H\033[2J");
      			System.out.flush();

			System.out.println("Which subjects grades do you wish to see?");
			int subject = input.nextInt();

			System.out.print("\033[H\033[2J");
      			System.out.flush();

			System.out.printf("%s%nExam %d%n", getCourseName(), subject);

			printSingleBars();

			for (int student = 1; student <= students; student++) {

				System.out.printf("Student %d: %2d%n", student, grades[student-1][subject-1]);

			}
			printSingleBars();
			printSingleBars();

			System.out.printf("TOTAL Grade: %d%n", subject, getTotal(subject));

			System.out.printf("MEAN Grade: %.1f%n", subject, getMean(subject));

			getHighestScorer(subject);

			printDoubleBars();
			printDoubleBars();

			printBarChart(subject);

	}

	public int getTotal(int subject) {

		int total = 0;

		for (int student = 1; student <= students; student++) {

			total += grades[student-1][subject-1];

		}

		return total;

	}

	public double getMean(int subject) {

		double mean = (double) getTotal(subject) / students;

		return mean;

	}

	public void getHighestScorer(int subject) {

		int highestGrade = grades[0][subject-1];
		int bestStudent = 1;

		for (int student = 1; student <= students; student++) {

			if (grades[student-1][subject-1] > highestGrade) {

				highestGrade = grades[student][subject-1];
				bestStudent = student + 1;

			}

		}

		System.out.printf("Subject %d's highest grade is %d, achieved by Student %d%n%n", subject, highestGrade, bestStudent);

	}

	public void printDoubleBars() {

		for (int i = 0; i < 50; i++) {

			System.out.print("=");

		}
		
		System.out.println();

	}

	public void printSingleBars() {

		for (int i = 0; i < 50; i++) {

			System.out.print("-");

		}
		
		System.out.println();

	}

	public void printBarChart(int subject) {

		System.out.printf("%nSubject %d's Distribution of Results:%n", subject);
		printSingleBars();

		int[] frequency = new int[11];

		for (int student = 1; student <= students; student++) {

			int percentage = grades[student-1][subject-1] / 10;
			frequency[percentage]++;

		}

		for (int count = 0; count < frequency.length; count++) {

			if (count == 10) System.out.printf("%5d:", 100);

			else {

				System.out.printf("%02d-%02d:", count * 10, (count * 10) + 9);

			}

			for (int stars = 0; stars < frequency[count]; stars++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

}
		
		












































	

	



























	

	










	

				