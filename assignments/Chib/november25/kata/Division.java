import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		getQuotient(number1, number2);

	}

	public static void getQuotient(int number1, int number2) {

		if (number2 == 0) System.out.println(0);

		else {

			double result = Math.abs((double) number1 / number2);
			System.out.println(result);

		}

	}

}