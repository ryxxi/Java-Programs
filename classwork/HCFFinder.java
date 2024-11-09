import java.util.Scanner;

public class HCFFinder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 integer: ");
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();

		int highestCommonFactor = 0;

		for (int i = 1; i < integer1 || i < integer2; i++) {

			if (integer1 % i == 0 && integer2 % i == 0) highestCommonFactor = i;

		}

		System.out.printf("The HCF of %d and %d is %d%n", integer1, integer2, highestCommonFactor);

	}

}
				