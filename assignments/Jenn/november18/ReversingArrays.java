import java.util.Scanner;

public class ReversingArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		for (int index = 0; index < size; index++) {

			System.out.print("Input a value for index " + index + ": ");
			int value = input.nextInt();

			array[index] = value;

		}

		System.out.println("\nNew Array\n");

		System.out.println("Index\tValue");

		for (int index = size - 1; index > -1; index--) {

			System.out.println(((size) - index) + "\t" + array[index]);

		}

	}

}