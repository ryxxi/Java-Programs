import java.util.Scanner;

public class OddPositionElements {

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

		getOddIndices(array);

	}

	public static void getOddIndices(int[] array) {

		for (int index = 1; index < array.length; index += 2) {

			System.out.println(array[index]);

		}

	}

}