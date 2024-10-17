import java.util.Scanner;

public class FeetToMetres {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your Distance in Feet: ");
		double distanceInFeet = input.nextDouble();

		double distanceInMetres = distanceInFeet * 0.305;

		System.out.printf("Distance in Metres is %f%n", distanceInMetres);

	}

}