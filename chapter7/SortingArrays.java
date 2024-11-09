import java.util.Scanner;

public class SortingArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];
		int[] sortedArray = new int[size];

		for (int index = 0; index < size; index++) {

			System.out.print("Enter an integer for index " + index + ": ");
			int value = input.nextInt();

			array[index] = value;

		}

		System.out.println("Would you like to rearrange your array in ascending(A) or descending(D) order?");
		char userChoice = input.next().charAt(0);

		userChoice = Character.toLowerCase(userChoice);

		switch (userChoice) {

			case 'a':

				for (int i = 0; i < size - 1; i++) {

					for (int j = 0; j < size - 1; j++) {

						if (array[j] > array[j + 1]) {

							int temp = array[j];
							array[j] = array[j + 1];
							array[j + 1] = temp;

						}

					}

				}

			break;

			case 'd':

				for (int i = 0; i < size - 1; i++) {

					for (int j = 0; j < size - 1; j++) {

						if (array[j] < array[j + 1]) {

							int temp = array[j];
							array[j] = array[j + 1];
							array[j + 1] = temp;

						}

					}

				}

			break;

			default:

				System.out.println("Invalid input\n");

		}

		System.out.println("Index\tValue");

		for (int index = 0; index < size; index++) {

			System.out.println(index + "\t" + array[index]);

		}

	}

}