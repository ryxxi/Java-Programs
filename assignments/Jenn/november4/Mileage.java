import java.util.Scanner;

public class Mileage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter miles travelled and gallons used: ");
		double miles = input.nextDouble();
		double gallons = input.nextDouble();

		double milesPerGallon = miles / gallons;
		double totalMPG =+ milesPerGallon;
		int trips = 1;

		System.out.printf("Miles per gallon from trip %d: %.2f%n%n", trips, totalMPG);

		System.out.print("Enter 0 to continue entering values, or enter -1 to quit: ");
		int choice = input.nextInt();


		while (choice == 0) {

		System.out.print("Enter miles travelled and gallons used: ");
		miles = input.nextDouble();
		gallons = input.nextDouble();
		milesPerGallon = miles / gallons;
		totalMPG = totalMPG+= milesPerGallon;
		trips++;
		System.out.printf("Miles per gallon from trip %d: %.2f%n%n", trips, milesPerGallon);

		System.out.print("Enter 0 to continue entering values, or enter -1 to quit: ");
		choice = input.nextInt();

		}

		System.out.printf("Total miles per gallon from %d trip(s): %.2f%n", trips, totalMPG);

	}

}