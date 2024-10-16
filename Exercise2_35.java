public class Exercise2_35 {

	public static void main(String... args) {

		double stones = 2300000;
		// Number of stones used

		double mass = 2.5;
		// Average mass of 1 stone in tons

		double years = 20;
		// Years to complete building the pyramid
		double hours = years * 365 * 24;
		double minutes = hours * 60;

		double stoneYear = stones / years;
		// "stoneYear" is the number of stones used per year on average
		double stoneHour = stones / hours;
		double stoneMinute = stones / minutes;

		double builtYear = stoneYear * mass;
		// "builtYear" is how much of the pyramid was built per year, in weight
		double builtHour = stoneHour * mass;
		double builtMinute = stoneMinute * mass;

		System.out.printf("%.2ftons were built per year%n", builtYear);
		System.out.printf("%.2ftons were built per hour%n", builtHour);
		System.out.printf("%.2ftons were built per minute%n", builtMinute);

	}

}