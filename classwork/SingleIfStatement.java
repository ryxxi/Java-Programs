import java.util.Scanner;

public class SingleIfStatement {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println(number1 > number2? "Greater": "");

		System.out.println("You are doing well!");

		int sum = number1 + number2;

		System.out.println (sum > 50? "Even sum is greater": "");

	}

}

		