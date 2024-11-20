import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];
		double total = 0;

		for (int index = 0; index < size; index++) {

			System.out.print("Enter an integer: ");
			int number = input.nextInt();

			array[index] = number;
		}


		for (int index : array) {

			total += index;

		}

		double average = total / size;
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);

	}

}