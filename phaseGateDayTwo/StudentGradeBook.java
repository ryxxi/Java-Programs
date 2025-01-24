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

				while (true) {
			
					System.out.printf("Enter Student %d's grade in Exam %d%n", student, exam);
					grade = input.nextLine();

					if (isGradeValid(grade)) break;
					System.out.println("Invalid input, try again");

				}

				grades[student - 1][exam - 1] = Integer.parseInt(grade);

			}

		}

		return grades;

	}

	public boolean isGradeValid(String string) {

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

		if (temp >= 0 && temp <= 100){
			return true;
		}

		return false;

	}

	public boolean isExamValid(String string) {

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

		if (temp >= 1 && temp <= exams){
			return true;
		}

		return false;

	}

	public void displayAll() {

		String userChoice = "";

		do {
			
			outputGrades();

			input.nextLine();
			System.out.println("Would you like to continue viewing?(Y/N)");
			userChoice = input.nextLine();

		} while (userChoice.toUpperCase().charAt(0) == 'Y');

	}

	public void outputGrades() {

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.println("Select:\n\n1. View Specific Exam Results\n2. View All Exam Results\n");
		String userChoice = input.nextLine();

		switch (userChoice.toUpperCase()) {

			case "1":
				displaySpecificExam();
				break;

			case "2":
				displayAllExams();
				break;

			default:
				System.out.println("Invalid input, try again");
				displayAll();

		}		

	}

	public int getExamTotal(int subject) {

		int total = 0;

		for (int student = 1; student <= students; student++) {

			total += grades[student-1][subject-1];

		}

		return total;

	}

	public double getExamMean(int subject) {

		double mean = (double) getExamTotal(subject) / students;

		return mean;

	}

	public void getHighestScorer(int subject) {

		int highestGrade = grades[0][subject-1];
		int bestStudent = 1;

		for (int student = 1; student <= students; student++) {

			if (grades[student-1][subject-1] > highestGrade) {

				highestGrade = grades[student-1][subject-1];
				bestStudent = student;

			}

		}

		System.out.printf("Exam %d's highest grade is %d, achieved by Student %d%n%n", subject, highestGrade, bestStudent);

	}

	public void printSpecificDoubleBars() {

		for (int i = 0; i < 50; i++) {

			System.out.print("=");

		}
		
		System.out.println();

	}

	public void printSpecificSingleBars() {

		for (int i = 0; i < 50; i++) {

			System.out.print("-");

		}
		
		System.out.println();

	}

	public void printSpecificBarChart(int subject) {

		System.out.printf("%nExam %d's Distribution of Results:%n", subject);
		printSpecificSingleBars();

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

	public void displaySpecificExam() {

		String userInput = "";

		while (true) {
			
			System.out.printf("Which exam's grades do you wish to see? (1 - %d)%n", exams);
			userInput = input.nextLine();

			if (isExamValid(userInput)) break;
			System.out.println("Invalid input, try again");

		}

		int exam = Integer.parseInt(userInput);

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.printf("%s%nExam %d%n", getCourseName(), exam);

		printSpecificDoubleBars();

		for (int student = 1; student <= students; student++) {

			System.out.printf("Student %d: %2d  (%d)%n", student, grades[student-1][exam-1], getExamPosition(student, exam));

		}
		printSpecificSingleBars();
		printSpecificSingleBars();

		System.out.printf("TOTAL Grade: %d%n", getExamTotal(exam));

		System.out.printf("MEAN Grade: %.1f%n", getExamMean(exam));

		getHighestScorer(exam);

		printSpecificDoubleBars();
		printSpecificDoubleBars();

		printSpecificBarChart(exam);

	}

	public void displayAllExams() {

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.printf("Gradebook for %s%n", getCourseName());
		printAllDoubleBars();
		
		System.out.print("Student");

		for (int exam = 1; exam <= exams; exam++) {

			System.out.printf("\tExam%d", exam);

		}

		System.out.println("\tTotal\tMean\tPos\n");

		displayAllStudents();

		printAllSingleBars();

		System.out.printf("TOTAL: %d%n", getAllTotal());
		System.out.printf("MEAN: %.1f%n", getAllMean());

		printAllSingleBars();
		printAllSingleBars();

		printAllBarChart();

	}

	public void displayAllStudents() {

		for (int student = 1; student <= students; student++) {

			System.out.printf("Stud%d", student);

			for (int exam = 1; exam <= exams; exam++) {

				System.out.printf("\t%d", grades[student-1][exam-1]);

			}

		System.out.printf("\t%d", getStudentTotal(student));
		System.out.printf("\t%.1f", getStudentMean(student));
		System.out.printf("\t%d", getOverallPosition(student));
		System.out.println("\n");

		}

	}

	public int getStudentTotal(int student) {

		int total = 0;

		for (int exam = 1; exam <= exams; exam++) {

			total += grades[student-1][exam-1];

		}

		return total;

	}

	public double getStudentMean(int student) {

		double mean = (double) getStudentTotal(student) / exams;

		return mean;

	}

	public int getAllTotal() {

		int total = 0;

		for (int student = 1; student <= students; student++) {

			for (int exam = 1; exam <= exams; exam++) {

				total += grades[student-1][exam-1];

			}

		}

		return total;

	}

	public double getAllMean() {

		double mean = (double) getAllTotal() / (students * exams);

		return mean;

	}

	public void printAllBarChart() {

		System.out.println("Distribution of All Results:");
		printAllSingleBars();

		int[] frequency = new int[11];

		for (int student = 1; student <= students; student++) {

			for (int exam = 1; exam <= exams; exam++) {

				int percentage = grades[student-1][exam-1] / 10;
				frequency[percentage]++;

			}

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

	public void printAllDoubleBars() {

		for (int i = 0; i < 80; i++) {

			System.out.print("=");

		}
		
		System.out.println();

	}

	public void printAllSingleBars() {

		for (int i = 0; i < 80; i++) {

			System.out.print("-");

		}
		
		System.out.println();

	}

	public int getExamPosition(int student, int exam) {

		int studentScore = grades[student-1][exam-1];
		int position = 1;

		for (int i = 1; i <= students; i++) {

			if (i != (student) && grades[i-1][exam-1] > studentScore) {

				position++;

			}

		}

		return position;

	}

	public int getOverallPosition(int student) {

		double studentMean = getStudentMean(student);
		int position = 1;

		for (int i = 1; i <= students; i++) {

			if (i != (student) && getStudentMean(i) > studentMean) {

				position++;

			}

		}

		return position;

	}		

}
		
		












































	

	



























	

	










	

				