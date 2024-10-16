import java.util.Scanner;

public class Exercise2_19 {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1: ");
		double x1 = input.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = input.nextDouble();

		System.out.print("Enter x2: ");
		double x2 = input.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = input.nextDouble();

		System.out.print("Enter x3: ");
		double x3 = input.nextDouble();
		System.out.print("Enter y3: ");
		double y3 = input.nextDouble();

		double squareside1 = ((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2));
		double side1 = Math.sqrt(squareside1);
		double squareside2 = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		double side2 = Math.sqrt(squareside2);
		double squareside3 = ((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3));
		double side3 = Math.sqrt(squareside3);

		double s = (side1 + side2 + side3) / 2;
		double squarearea = s * (s - side1) * (s - side2) * (s - side3);
		double area = Math.sqrt(squarearea);

		System.out.printf("The area is %.2f%n", area);

	}

}