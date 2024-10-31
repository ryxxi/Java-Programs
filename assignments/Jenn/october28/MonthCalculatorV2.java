import java.util.Scanner;

public class MonthCalculatorV2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a month number: ");
		int month = input.nextInt();

		System.out.print("Input a year: ");
		int year = input.nextInt();

		int days;
		String monthName = "hello";

		if (month == 1) monthName = "Jan";
		if (month == 2) monthName = "Feb";
		if (month == 3) monthName = "Mar";
		if (month == 4) monthName = "Apr";
		if (month == 5) monthName = "May";
		if (month == 6) monthName = "June";
		if (month == 7) monthName = "July";
		if (month == 8) monthName = "Aug";
		if (month == 9) monthName = "Sep";
		if (month == 10) monthName = "Oct";
		if (month == 11) monthName = "Nov";
		if (month == 12) monthName = "Dec";

		if (month == 2) {
			if (year % 4 == 0) System.out.printf("%s %d has 29 days%n", monthName, year);

			else System.out.printf("%s %d has 28 days%n", monthName, year);
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		days = 31;
		System.out.printf("%s %d has %d days%n", monthName, year, days);
		}

		else if (month == 2 || month == 4 || month == 9 || month == 11) {
		days = 30;
		System.out.printf("%s %d has %d days%n", monthName, year, days);
		}

	}

}













