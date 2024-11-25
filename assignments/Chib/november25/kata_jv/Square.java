import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		getSquare(number);

	}

	public static void getSquare(int number) {

		long square = number * number

		System.out.println(square);	

	}

}