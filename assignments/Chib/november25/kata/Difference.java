import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		getDifference(number1, number2);

	}

	public static void getDifference(int number1, int number2) {

		int result = Math.abs(number1 - number2);

		System.out.println(result);

	}

}