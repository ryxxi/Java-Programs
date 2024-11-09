import java.util.Scanner;

public class BasicTextMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userChoice = 0;

		do {

		System.out.print("""

				Select:

				1) Add
				2) View
				3) Delete
				4) Quit

				""");
				userChoice = input.nextInt();

		switch (userChoice) {

			case 1: System.out.println("You have selected 'Add'"); break;
			case 2: System.out.println("You have selected 'View'"); break;
			case 3: System.out.println("You have selected 'Delete'"); break; 
			case 4: System.out.println("You have selected 'Quit'"); break; 
			default: System.out.println("Invalid input");

		} 

		} while (userChoice != 4);

	}

}