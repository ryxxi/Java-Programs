// This program serves to calculate the product of 3 integers

import java.util.Scanner;

public class VariableProduct {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st integer: ");
		int x = input.nextInt();

		System.out.print("Enter 2nd integer: ");
		int y = input.nextInt();

		System.out.print("Enter 3rd integer: ");
		int z = input.nextInt();

		int result = x * y * z;

		System.out.printf("Product is %d%n", result);

	}

}