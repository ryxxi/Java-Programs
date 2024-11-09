import java.util.Scanner;

public class ShiftingArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		for (int index = 0; index < size; index++) {

			System.out.print("Enter an integer for index " + index + ": ");
			int value = input.nextInt();

			array[index] = value;

		}

		System.out.println("\nOriginal Array\n");
		System.out.println("Index\tValue");

		for (int index = 0; index < size; index++) {

			System.out.println(index + "\t" + array[index]);

		}

		System.out.print("Enter value by which the array should shift: ");
		int shift = input.nextInt();

		int[] newArray = new int[size];

		for (int index = size - 1; index > -1; index--) {

			if (index - shift >= 0) {
				newArray[index] = array[index - shift];
			}

			else {
				newArray[index] = array[(index - shift) + size];
			}

		}

		System.out.println("\nNew Array\n");
		System.out.println("Index\tValue");

		for (int index = 0; index < size; index++) {

			System.out.println(index + "\t" + newArray[index]);

		}

	}

}

		

			