import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		checkIfPrime(number);

	}

	public static void checkIfPrime(int number) {

		boolean isPrime = true;

		for (int divider = 2; divider < (int) Math.sqrt(number); divider++) {

			if (number % divider == 0) {

				isPrime = false;
				break;

			}

		}

		System.out.println(isPrime?"Prime":"Not prime");

	}

}