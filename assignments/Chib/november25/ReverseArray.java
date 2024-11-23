import java.util.Scanner;

public class ReverseArray {

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

		getReverse(array);

	}

	public static void getReverse(int[] array) {

		int[] newArray = new int[array.length];

		for (int index = 0; index < array.length; index++) {

			newArray[index] = array[(array.length - 1) - index];

		}

		for (int index = 0; index < array.length; index++) {

			System.out.println(newArray[index]);

		}

	}

}