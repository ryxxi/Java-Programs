import java.util.Scanner;

public class ShapeAreas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("""

				What shape do you want to find the area of?

				Choose between:

				1. Rectangle
				2. Triangle
				3. Circle

				""");
		int shapeChoice = input.nextInt();
		int valueChoice;

		switch (shapeChoice) {
			case 1:
				System.out.print("""

						Do you want to input your own values?

						1. Yes
						2. No

						""");
				valueChoice = input.nextInt();

				switch (valueChoice) {
					case 1:
						System.out.println("Enter length and width: ");
						double length = input.nextDouble();
						double width = input.nextDouble();

						double squareArea = length * width;

						System.out.printf("The area is %.2f%n", squareArea);
						break;
					case 2:
						System.out.println("Using dummy values with length of 10 and width of 4, the area is 40");
						break;
					default:
						System.out.println("Invalid input");
						break;
				}
			break;
			case 2:
				System.out.print("""

						Do you want to input your own values?

						1. Yes
						2. No

						""");
				valueChoice = input.nextInt();

				switch (valueChoice) {
					case 1:
						System.out.println("Enter base and height: ");
						double base = input.nextDouble();
						double height = input.nextDouble();

						double triangleArea = base * height * 0.5;

						System.out.printf("The area is %.2f%n", triangleArea);
						break;
					case 2:
						System.out.println("Using dummy values with base of 10 and height of 4, the area is 20");
						break;
					default:
						System.out.println("Invalid input");
						break;
				}
			break;
			case 3:
				System.out.print("""

						Do you want to input your own values?

						1. Yes
						2. No

						""");
				valueChoice = input.nextInt();

				switch (valueChoice) {
					case 1:
						System.out.println("Enter radius: ");
						double radius = input.nextDouble();

						double circleArea = radius * radius * 3.14159;

						System.out.printf("The area is %.2f%n", circleArea);
						break;
					case 2:
						System.out.println("Using dummy values with radius of 10, the area is 314.16");
						break;
					default:
						System.out.println("Invalid input");
						break;
				}
			break;
			default:
				System.out.println("What shape??");

		}

	}

}