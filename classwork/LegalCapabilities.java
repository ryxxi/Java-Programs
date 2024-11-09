import java.util.Scanner;

public class LegalCapabilities {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = input.nextInt();

		int counter = 0;

		if (age >= 21) counter++;
		if (age >= 18) counter++;
		if (age >= 16) counter++;

		if (counter == 3) System.out.println("You can drink, drive and vote");
		else if (counter == 2) System.out.println("You can drive and vote");
		else if (counter == 1) System.out.println("You can drive");
		else System.out.println("You can't do anything");

	}

}
