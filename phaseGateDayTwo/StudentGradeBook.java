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

				String grade = "";

				do{
			
					System.out.printf("Enter Student %d's grade in Exam %d%n", student, exam);
					grade = input.nextLine();

					if (!isGradeInvalid(grade)) System.out.println("Invalid input, try again");

				} while (!isGradeInvalid(grade));

				grades[student - 1][exam - 1] = Integer.parseInt(grade);

			}

		}

		return grades;

	}

	public boolean isGradeInvalid(String string) {

		for (int i = 0; i < string.length(); i++) {

			if(!Character.isDigit(string.charAt(i))) return false;

				if (Integer.parseInt(string) < 0 || Integer.parseInt(string) > 100) return false;

		}
		return true;

	}

	public boolean isExamInvalid(String string) {

		for (int i = 0; i < string.length(); i++) {

			if(!Character.isDigit(string.charAt(i))) return false;

				if (Integer.parseInt(string) < 0 || Integer.parseInt(string) > (examse)) return false;

		}
		return true;

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

			String userInput = "";

			do{
			
				System.out.printf("Which exam's grades do you wish to see? (1 - %d)%n", exams);
				userInput = input.nextLine();

				if (!isExamInvalid(userInput)) System.out.println("Invalid input, try again");

			} while (!isExamInvalid(userInput));

			int exam = Integer.parseInt(userInput);

			System.out.print("\033[H\033[2J");
      			System.out.flush();

			System.out.printf("%s%nExam %d%n", getCourseName(), exam);

			printSingleBars();

			for (int student = 1; student <= students; student++) {

				System.out.printf("Student %d: %2d%n", student, grades[student-1][exam-1]);

			}
			printSingleBars();
			printSingleBars();

			System.out.printf("TOTAL Grade: %d%n", getTotal(exam));

			System.out.printf("MEAN Grade: %.1f%n", getMean(exam));

			getHighestScorer(exam);

			printDoubleBars();
			printDoubleBars();

			printBarChart(exam);

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

				highestGrade = grades[student-1][subject-1];
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
		
		












































	

	



























	

	










	

				