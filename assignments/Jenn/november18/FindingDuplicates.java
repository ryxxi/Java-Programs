import java.util.Scanner;

public class FindingDuplicates {

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

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (array[i] == array[j]) {

					System.out.println(array[i]);
					break;

				}

			}

		}

	}

}