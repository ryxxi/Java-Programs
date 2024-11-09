import java.util.Scanner;

public class ArraySpecificOccurrences {

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

		int specificIndex;

		do {

		System.out.printf("Pick an index from 0-%d to see how many times the values occurs in the array, or type -1 to end: ", size - 1);
		specificIndex = input.nextInt();
		if (specificIndex == -1) break;

		int occurrenceCounter = 0;

		for (int number : array) {
			
			if (number == array[specificIndex]) {

				occurrenceCounter++;

			}

		}

			System.out.printf("Index %d occurs %d time(s)%n", specificIndex, occurrenceCounter);
			occurrenceCounter = 0;

		} while (specificIndex != -1);

	}

}
				