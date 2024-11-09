import java.util.Scanner;

public class ArrayLargeSmall {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = new int[5];
	
		int index = 0;

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		array[index] = number;
		int largest = array[index];
		int smallest = array[index];

		for (index = 1; index < 5; index++) {
			System.out.print("Enter an integer: ");
			number = input.nextInt();

			array[index] = number;

			if (array[index] > largest) largest = array[index];
			if (array[index] < smallest) smallest = array[index];
		}
		System.out.println("Index\tValue");

		for (index = 0; index < 5; index++) {
			System.out.println(index + "\t" + array[index]);
		}


		System.out.printf("Largest: %d%nSmallest: %d%n", largest, smallest);

	}

}

			