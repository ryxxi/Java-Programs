import java.util.Scanner;

public class StudentCourse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter course: ");
		String course = input.nextLine().toLowerCase();
		String gradeLevel;

		switch (course) {
			case "math":
				System.out.print("Enter your grade: ");
				gradeLevel = input.nextLine().toLowerCase();

				switch (gradeLevel) {
					case "freshman":
						System.out.println("Your course instructor is Ms Acker");
						break;
					case "sophomore":
						System.out.println("Your course instructor is Mr Bentley");
						break;
					case "junior":
						System.out.println("Your course instructor is Mr Crews");
						break;
					case "senior":
						System.out.println("Your course instructor is Ms Daisy");
						break;
					default:
						System.out.println("You're in what grade??");
						break;
				}
			break;
			case "science":
				System.out.print("Enter your grade: ");
				gradeLevel = input.nextLine().toLowerCase();

				switch (gradeLevel) {
					case "freshman":
						System.out.println("Your course instructor is Ms Entley");
						break;
					case "sophomore":
						System.out.println("Your course instructor is Mrs Flimmon");
						break;
					case "junior":
						System.out.println("Your course instructor is Ms Grey");
						break;
					case "senior":
						System.out.println("Your course instructor is Mr Harves");
						break;
					default:
						System.out.println("You're in what grade??");
						break;
				}
			break;
			case "history":
				System.out.print("Enter your grade: ");
				gradeLevel = input.nextLine().toLowerCase();

				switch (gradeLevel) {
					case "freshman":
						System.out.println("Your course instructor is Ms Ingles");
						break;
					case "sophomore":
						System.out.println("Your course instructor is Mr Jackson");
						break;
					case "junior":
						System.out.println("Your course instructor is Mr Katz");
						break;
					case "senior":
						System.out.println("Your course instructor is Mr Lyon");
						break;
					default:
						System.out.println("You're in what grade??");
						break;
				}
			break;
			default:
				System.out.println("What course is that??");

		}

	}

}