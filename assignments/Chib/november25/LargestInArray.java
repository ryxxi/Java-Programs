import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		for (int index = 0; index < size; index++) {

			System.out.printf("Enter an integer for index %d: ", index);
			int value = input.nextInt();

			array[index] = value;

		}

		getLargest(array);

	}

	public static void getLargest(int[] array) {

		int largest = array[0];

		for (int value : array) {

			if (value > largest) largest = value;

		}

		System.out.printf("The largest is %d%n", largest);

	}

}