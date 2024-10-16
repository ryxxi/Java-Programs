import java.util.Scanner;

public class WorldPop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a digit 1-5: ");
		int yearRequested = input.nextInt();

		long worldPop = 8179020480L;

		double popGrowthRate = 1.0083;

		double year1 = worldPop * popGrowthRate;

		double year2 = worldPop * (popGrowthRate * popGrowthRate);

		double year3 = worldPop * (popGrowthRate * popGrowthRate * popGrowthRate);

		double year4 = worldPop * (popGrowthRate * popGrowthRate * popGrowthRate * popGrowthRate);

		double year5 = worldPop * (popGrowthRate * popGrowthRate * popGrowthRate * popGrowthRate * popGrowthRate);

		if (yearRequested == 1) {
		System.out.printf("Expected population is %s%n", year1);
		}
		
		if (yearRequested == 2) {
		System.out.printf("Expected population is %s%n", year2);
		}

		if (yearRequested == 3) {
		System.out.printf("Expected population is %s%n", year3);
		}

		if (yearRequested == 4) {
		System.out.printf("Expected population is %s%n", year4);
		}

		if (yearRequested == 5) {
		System.out.printf("Expected population is %s%n", year5);
		}

		if (yearRequested < 1 && yearRequested > 5) {
		System.out.println("Error - invalid user input. Rerun the program, using an integer from 1-5");
		}

	}

}