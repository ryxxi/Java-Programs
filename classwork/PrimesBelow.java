import java.util.Scanner;
import java.util.Arrays;

public class PrimesBelow {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		getPrimesBelow(number);

	}


	public static int getNumberOfPrimes(int number) {

		boolean isPrime = true;
		int primeCount = 0;

		for (int divider = 2; divider < number; divider++) {

			for (int checkDivider = 2; checkDivider < divider; checkDivider++) {

				int result = divider % checkDivider;

				if (result == 0) isPrime = false;

			}

			if (divider == 2) primeCount++;

			else if (isPrime) primeCount++;

			isPrime = true;

		}

		return primeCount;

	}

	public static void getPrimesBelow(int integer) {

		int LENGTH = getNumberOfPrimes(integer);
		int[] primes = new int[LENGTH];
		boolean isPrime = true;
		int index = 0;

		for (int divider = 2; divider < integer; divider++) {

			for (int checkDivider = 2; checkDivider < divider; checkDivider++) {

				int result = divider % checkDivider;

				if (result == 0) isPrime = false;

			}

			if (divider == 2) {

				primes[index] = divider;
				index++;

			}

			else if (isPrime) {

				primes[index] = divider;
				index++;

			}

			isPrime = true;

		}

		System.out.println(Arrays.toString(primes));

	}

}