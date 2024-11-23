import java.util.Scanner;

public class ArraySumAllLoops {

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

		getArraySumFor(array);
		getArraySumWhile(array);
		getArraySumDoWhile(array);

	}

	public static void getArraySumFor(int[] array) {

		int total = 0;

		for (int index = 0; index < array.length; index++) {

			total += array[index];

		}

		System.out.println("The sum is " + total);

	}

	public static void getArraySumWhile(int[] array) {

		int total = 0;
		int index = 0;

		while (index < array.length) {

			total += array[index];
			index++;

		}		

		System.out.println("The sum is " + total);

	}

	public static void getArraySumDoWhile(int[] array) {

		int total = 0;
		int index = 0;

		do {

			total += array[index];
			index++;

		} while (index < array.length);	

		System.out.println("The sum is " + total);

	}

}