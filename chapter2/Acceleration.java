import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter initial velocity(m/s): ");
		double velocity0 = input.nextDouble();

		System.out.print("Enter final velocity(m/s): ");
		double velocity1 = input.nextDouble();

		System.out.print("Enter time taken(s): ");
		double time = input.nextDouble();

		double acceleration = (velocity1 - velocity0) / time;

		System.out.printf("Acceleration(m/s^2) is %f%n", acceleration);

	}

}