import java.util.Scanner;

public class HeatingEnergy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Mass of water, in kg: ");
		double waterMass = input.nextDouble();

		System.out.print("Initial water temperature, in celsius: ");
		double initialWaterTemp = input.nextDouble();

		System.out.print("Final water temperature, in celsius: ");
		double finalWaterTemp = input.nextDouble();

		double requiredEnergy = waterMass * (finalWaterTemp - initialWaterTemp) * 4184;

		System.out.printf("Required energy, in Joules, is %f%n Joules", requiredEnergy);

	}

}