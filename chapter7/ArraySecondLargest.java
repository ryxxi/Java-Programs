import java.util.Scanner;

public class ArraySecondLargest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		System.out.print("Enter an integer for index 0: ");
		int value = input.nextInt();

		array[0] = value;
		int largest = array[0];
		int secondLargest = 0;

		for (int index = 1; index < size; index++) {

			System.out.print("Enter an integer for index " + index + ": ");
			value = input.nextInt();

			array[index] = value;

			if (array[index] > largest) {

				secondLargest = largest;
				largest = array[index];

			}

			else if (array[index] > secondLargest && array[index] != largest) {

				secondLargest = array[index];

			}

		}

		System.out.println("\n");

		System.out.println("Index\tValue");

		for (int index = 0; index < size; index++) {

			System.out.println(index + "\t" + array[index]);

		}

		System.out.printf("%nLargest: %d%nSecond Largest: %d%n%n", largest, secondLargest);

	}

}