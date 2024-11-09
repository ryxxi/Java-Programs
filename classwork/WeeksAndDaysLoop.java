public class WeeksAndDaysLoop {

	public static void main(String[] args) {

		for (int week = 1; week < 4; week++) {

			System.out.printf("Week %d%n%n", week);

			for (int day = 2; day < 7; day+=2) {

				System.out.printf("Day: %d%n", day);

			}

			System.out.println("\n");

		}

	}

}