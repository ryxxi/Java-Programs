import java.util.Scanner;

public class Quadratics {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double a = input.nextDouble();

		System.out.print("Enter second number: ");
		double b = input.nextDouble();

		System.out.print("Enter third number: ");
		double c = input.nextDouble();

		double discriminant = (b * b) - (4 * a * c);

		if (discriminant > 0) {

		double root1 = (-(b) + Math.sqrt(discriminant)) / (2 * a);
		double root2 = (-(b) - Math.sqrt(discriminant)) / (2 * a);
		System.out.printf("Root 1 = %.3f%nRoot 2 = %.3f%n", root1, root2);

		} else if (discriminant == 0) {
		double root = -(b) / (2 * a);
		System.out.printf("Root = %.3f%n", root);

		} else {

		double real = -(b) / (2 * a);
		double imaginary = Math.sqrt(-(discriminant)) / (2 * a);
		System.out.printf("Root 1 = %.3f+%.3fi%n", real, imaginary);
		System.out.printf("Root 2 = %.3f-%.3fi%n", real, imaginary);
		
		}
		
	}

}