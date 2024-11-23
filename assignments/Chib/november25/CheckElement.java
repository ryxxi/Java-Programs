import java.util.Scanner;

public class CheckElement {

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

		System.out.print("Enter a value to check if it occurs in the array: ");
		int value = input.nextInt();

		checkArrayFor(value, array);

	}

	public static void checkArrayFor(int value, int[] array) {

		boolean isPresent = false;

		for (int element : array) {

			if (element == value) {

				isPresent = true;
				break;

			}

		}

		System.out.print(isPresent?"It is present\n":"It isn't present\n");

	}

}