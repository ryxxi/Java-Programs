import java.util.Scanner;

public class Desserts {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("""

				What sort of dessert do you want?

				Choose between:

				1. Shakes
				2. Ice cream
				3. Sundaes

				""");
		int dessertChoice = input.nextInt();
		int flavourChoice;

		switch (dessertChoice) {
			case 1:
				System.out.print("""

						What flavour would you like?

						Choose between:

						1. Chocolate
						2. Vanilla
						3. Strawberry

						""");
				flavourChoice = input.nextInt();

				switch (flavourChoice) {
					case 1:
						System.out.println("1 Chocolate Shake coming right up!");
						break;
					case 2:
						System.out.println("1 Vanilla Shake coming right up!");
						break;
					case 3:
						System.out.println("1 Strawberry Shake coming right up!");
						break;
					default:
						System.out.println("Sorry we don't have that flavour, maybe you wanna think about your dessert longer?");
						break;
				}
			break;
			case 2:
				System.out.print("""

						What flavour would you like?

						Choose between:

						1. Chocolate
						2. Vanilla
						3. Strawberry

						""");
				flavourChoice = input.nextInt();

				switch (flavourChoice) {
					case 1:
						System.out.println("1 Chocolate Ice Cream coming right up!");
						break;
					case 2:
						System.out.println("1 Vanilla Ice Cream coming right up!");
						break;
					case 3:
						System.out.println("1 Strawberry Ice Cream coming right up!");
						break;
					default:
						System.out.println("Sorry we don't have that flavour, maybe you wanna think about your dessert longer?");
						break;
				}
			break;
			case 3:
				System.out.print("""

						What flavour would you like?

						Choose between:

						1. Chocolate
						2. Vanilla
						3. Strawberry

						""");
				flavourChoice = input.nextInt();

				switch (flavourChoice) {
					case 1:
						System.out.println("1 Chocolate Sundae coming right up!");
						break;
					case 2:
						System.out.println("1 Vanilla Sundae coming right up!");
						break;
					case 3:
						System.out.println("1 Strawberry Sundae coming right up!");
						break;
					default:
						System.out.println("Sorry we don't have that flavour, maybe you wanna think about your dessert longer?");
						break;
				}
			break;
			default:
				System.out.println("Sorry we don't serve that, maybe you wanna think about your dessert longer?");

		}

	}

}