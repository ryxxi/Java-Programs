import java.util.Scanner;

public class PrismAreaAndVolume {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side length in cm: ");
		double sideLength = input.nextDouble();

		double number = 3;
		double root3 = Math.sqrt(number);
		double area = (root3 / 4) * sideLength;
		double volume = area * sideLength;

		System.out.printf("The area is %.2fcm%nThe volume is %.2fcm%n", area, volume);

	}

}