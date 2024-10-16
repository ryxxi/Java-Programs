import java.util.Scanner;

public class WhileRev {

	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students or (0) to quit: ");
		int students = input.nextInt();

		double total = 0;
		int gradeCounter = 1;

		if (students == 0) {
		
		System.out.println("Program terminated");
		}

		else {

		while (gradeCounter <= students) {

		System.out.print("Enter a grade: ");
		int grade = input.nextInt();

		total = total + grade;
		gradeCounter = gradeCounter + 1;

		}
		

		System.out.printf("Total grades are %.2f from %d students%n", total, students);
		
		double avg = total / students;

		System.out.printf("Avg grade is %.2f%n", avg);
		}

	}

}
		

		