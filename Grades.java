import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter student score: ");
		int studentGrade = input.nextInt();

		if (studentGrade >100) {
		System.out.println("Error");
		}

		else if (studentGrade >= 95) {
		System.out.println("A+");
		}

		else if (studentGrade >= 85) {
		System.out.println("A");
		}

		else if (studentGrade >= 75) {
		System.out.println("B");
		}

		else if (studentGrade >= 65) {
		System.out.println("C");
		}

		else if (studentGrade >= 55) {
		System.out.println("D");
		}

		else {
		System.out.println("F");
		}
		
		if (studentGrade > 100) {
		System.out.println("Score must range from 0-100.");
		}

		else {
		System.out.println(studentGrade >= 55 ? "Pass" : "Fail");
		System.out.println(studentGrade >= 55 ? "Proceed to the next module" : "You must retake this module");
		}
	}

}