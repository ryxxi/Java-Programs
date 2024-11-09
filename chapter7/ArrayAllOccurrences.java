import java.util.Scanner;

public class ArrayAllOccurrences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		for (int index = 0; index < size; index++) {

			System.out.print("Input an integer for index " + index + ": \n");
			int number = input.nextInt();

			array[index] = number;

		}

		int occurrenceCounter = 0;

		for (int index = 0; index < size; index++) {

			for (int number : array) {

				if (number == array[index]) {

					occurrenceCounter++;
				}

			}

			System.out.printf("Index %d occurs %d time(s)%n", index, occurrenceCounter);
			occurrenceCounter = 0;

		}

	}

}
				