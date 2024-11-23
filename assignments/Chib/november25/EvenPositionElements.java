import java.util.Scanner;

public class EvenPositionElements {

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

		getEvenIndices(array);

	}

	public static void getEvenIndices(int[] array) {

		for (int index = 0; index < array.length; index += 2) {

			System.out.println(array[index]);

		}

	}

}