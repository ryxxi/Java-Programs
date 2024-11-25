import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		getFactorial(number);

	}

	public static void getFactorial(int number) {

		long factorial = 1;
		
		for (int index = 0; index < number; index++) {

			factorial *= (number - index);

		}

		System.out.println(factorial);		

	}

}