import java.util.Scanner;

public class RunningTotal {

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

		getRunningTotal(array);

	}

	public static void getRunningTotal(int[] array) {

		int[] runningTotal = new int[array.length];
		int total = 0;

		for (int index = 0; index < array.length; index++) {

			total += array[index];
			runningTotal[index] = total;

		}

		for (int index = 0; index < array.length; index++) {

			System.out.println(runningTotal[index]);

		}

	}

}