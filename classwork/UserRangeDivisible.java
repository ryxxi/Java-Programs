import java.util.Scanner;

public class UserRangeDivisible {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 integer: ");
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();

		boolean isDivisible = false;
		int i = 0;

		if (integer1 > integer2) {

		for (i = integer2; i < integer1; i++) {

			if (i % 13 == 0 && i % 7 == 0) {
				isDivisible = true;
				break;
			}

		}
		if (isDivisible == true	) {
			System.out.printf("The first multiple of 7 and 13 between %d and %d is %d%n", integer2, integer1, i);
		}
		else System.out.printf("There are no multiples of both 13 and 7 between %d and %d%n", integer2, integer1);
		}

		else {

		for (i = integer1; i < integer2; i++) {

			if (i % 13 == 0 && i % 7 == 0) {
				isDivisible = true;
				break;
			}

		}
		if (isDivisible == true	) {
			System.out.printf("The first multiple of 7 and 13 between %d and %d is %d%n", integer1, integer2, i);
		}
		else System.out.printf("There are no multiples of both 13 and 7 between %d and %d%n", integer1, integer2);

		}

	}

}
