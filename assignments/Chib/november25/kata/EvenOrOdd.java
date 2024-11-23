import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		checkEven(number);

	}

	public static void checkEven(int number) {

		boolean isEven = false;

		if (number % 2 == 0) isEven = true;

		System.out.println(isEven?"Even":"Odd");

	}

}