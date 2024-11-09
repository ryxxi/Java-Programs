import java.util.Scanner;

public class ReversingArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		System.out.println("Orignal array: ");

		for (int index = 0; index < size; index++) {

			System.out.print("Input an integer for index " + index + ": ");
			int number = input.nextInt();

			array[index] = number;

		}

		System.out.println("New array: ");

		System.out.println("Index\tValue");

		for (int index = 0; index < size; index++) {

			System.out.println(index + "\t" + array[(size - 1) - index]);

		}

	}

}