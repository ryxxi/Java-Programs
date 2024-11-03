import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("""

				Welcome!

				Select:

				1. Find (n)!
				2. Get e
				3. Get e^x

				""");
		int choice = input.nextInt();

		switch (choice) {
			case 1:
				System.out.print("Enter an integer: ");
				int number = input.nextInt();

				double factorial = number;
				double original = number;

				while (number != 1) {
					factorial *= (number - 1);
					number -= 1;
				}

				System.out.printf("%d! = %d", original, factorial);
				break;

			case 2:
				double numerator = 1;
				double denominator = 1;
				factorial = 1;
				double fraction = numerator / factorial;

				double e = 1;

				double counter = 50;

				while (counter > 0) {
					factorial *= denominator;
					fraction = numerator / factorial;
					e += fraction;

					denominator += 1;
					counter -=1;
				}

				System.out.println(e);
				break;

			case 3: 
				System.out.print("Enter e's exponent: ");
				int exponent = input.nextInt();

				numerator = 1;
				denominator = 1;
				factorial = denominator;
				fraction = numerator / factorial;

				double eRaised = 1;

				counter = 50;

				while (counter > 0) {
					factorial *= denominator;
					fraction = numerator / factorial;
					eRaised += fraction;

					denominator += 1;
					counter -=1;
				}

				while (exponent != 1) {
					eRaised *= eRaised;
					exponent--;
				}

				System.out.printf("e^%d = %f", exponent, eRaised);
				break;

			default:
				System.out.println("Invalid input");
				break;

		}

	}

}








































		