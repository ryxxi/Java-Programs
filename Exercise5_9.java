import java.util.Scanner;

public class Exercise5_9 {

	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of number of students or (0) to quit: ");
		int nOfStudents = input.nextInt();

		int counter = 1;

		if (nOfStudents == 0) {
		
		System.out.println("Program terminated");
		}

		else {

		while (counter <= nOfStudents) {

		System.out.print("Enter student name: ");
		String literalName = input.nextLine();

		System.out.print("Enter student's grade: ");
		int grade = input.nextInt();
		counter = counter + 1;

		
		}

		
		}

	}

}