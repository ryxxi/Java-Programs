import java.util.Scanner;

public class DepartmentAndRole {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter department: ");
		String department = input.nextLine().toLowerCase();
		String role;

		switch (department) {
			case "it":
				System.out.print("State your role in the IT department: ");
				role = input.nextLine().toLowerCase();

				switch (role) {
					case "manager":
						System.out.println("You are a manager in the IT department");
						break;
					case "analyst":
						System.out.println("You are an analyst in the IT department");
						break;
					case "intern":
						System.out.println("You are an intern in the IT department");
						break;
					default:
						System.out.println("Who??");
						break;
				}
			break;
			case "hr":
				System.out.print("State your role in the IT department: ");
				role = input.nextLine().toLowerCase();

				switch (role) {
					case "manager":
						System.out.println("You are a manager in the HR department");
						break;
					case "analyst":
						System.out.println("You are an analyst in the HR department");
						break;
					case "intern":
						System.out.println("You are an intern in the HR department");
						break;
					default:
						System.out.println("Who??");
						break;
				}
			break;
			case "finance":
				System.out.print("State your role in the IT department: ");
				role = input.nextLine().toLowerCase();

				switch (role) {
					case "manager":
						System.out.println("You are a manager in the Finance department");
						break;
					case "analyst":
						System.out.println("You are an analyst in the Finance department");
						break;
					case "intern":
						System.out.println("You are an intern in the Finance department");
						break;
					default:
						System.out.println("Who??");
						break;
				}
			break;
			default:
				System.out.println("Where???");

		}

	}

}