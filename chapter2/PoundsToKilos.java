import java.util.Scanner;

public class PoundsToKilos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your Mass in pounds: ");
		double massInPounds = input.nextDouble();

		double massInKilos = massInPounds * 0.454;

		System.out.printf("Mass in kilos is %f%n", massInKilos);

	}

}