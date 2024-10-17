import java.util.Scanner;

public class Mathsy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 2 integers: ");
		int integers1 = input.nextInt();

		System.out.println("Enter 2 more integers: ");
		int integers2 = input.nextInt();

		int sum = integers1 + integers2;

		System.out.printf(" Sum is %s%n", sum);

	}

}