import java.util.Scanner;

public class CircleMeasurements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter radius(cm): ");
		double radius = input.nextDouble();

		double pi = 3.141592;

		double diameter = 2 * radius;

		double circumference = 2 * radius * pi;

		double area = pi * (radius * radius);

		System.out.printf("Diameter(cm) is %s%n", diameter);
		System.out.printf("Circumference(cm) is %s%n", circumference);
		System.out.printf("Area(cm squared) is %s%n", area);

	}

}