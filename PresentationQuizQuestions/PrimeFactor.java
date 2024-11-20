import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to find prime factors: ");
		int number = input.nextInt();
		int dupeNumber = number;
		boolean isNotPrime = false;

		int checkDivider = 2;
		int divider = 2;

		while (checkDivider < number) {

			int divider = checkDivider;

			while (temp < divider) {

				int result = divider % temp;

				if (divider != temp && result != 0) temp++;

				else {
					isNotPrime = true;
					break;
				}

			}

			if (!isNotPrime) {
				checkDivider







		}

		for (int checkDivider = 2; checkDivider < number; checkDivider++) {

			int divider = checkDivider;

			for (int temp = 2; temp < divider; divider++) {

				if (divider % temp == 0)

				}

	}

}



















