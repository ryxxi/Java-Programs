import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter driving distance(miles): ");
		double distance = input.nextDouble();

		System.out.print("Enter fuel efficiency(miles/gal): ");
		double fuelEfficiency = input.nextDouble();

		System.out.print("Enter price of a gallon($): ");
		double pricePerGallon = input.nextDouble();

		double costOfJourney = (distance / fuelEfficiency) * pricePerGallon;

		System.out.printf("Cost of journey($) is %f%n", costOfJourney);

	}

}