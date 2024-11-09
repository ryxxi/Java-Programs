import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		int sum = 0;

		for (int i = 1; i < integer; i++) {
			if (integer % i == 0) sum += i;
		}

		if (sum == integer) System.out.printf("%d is a perfect number%n", integer);
		else System.out.printf("%d is not a perfect number%n", integer);

	}

}