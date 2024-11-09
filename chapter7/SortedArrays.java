import java.util.Scanner;

public class SortedArrays { 

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		System.out.print("Enter an integer for index 0: ");
		int value = input.nextInt();

		array[0] = value;

		for (int index = 1; index < size; index++) {

			System.out.print("Enter an integer for index " + index + ": ");
			value = input.nextInt();

			array[index] = value;

		}

		boolean isDescending = false;
		boolean isAscending = false;

		for (int index = 1; index < size; index++) {

			if (array[index] < array[index - 1]) {
				isDescending = true;
			}

			else {
				isDescending = false;
				break;
			}

		}

		for (int index = 1; index < size; index++) {

			if (array[index] > array[index - 1]) {
				isAscending = true;
			}

			else {
				isAscending = false;
				break;
			}

		}

		System.out.println("\nIndex\tValue");

		for (int index = 0; index < size; index++) {

			System.out.println(index + "\t" + array[index]);

		}

		System.out.println();

		if (isDescending == true) System.out.println("The values of your array are in descending order");

		else if (isAscending == true) System.out.println("The values of your array are in ascending order");

		else System.out.println("The values of your array are in neither ascending nor descending order");

	}

}