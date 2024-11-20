import java.util.Scanner;

public class SpecificArrayElement{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		for (int index = 0; index < size; index++) {

			System.out.print("Input an integer for index " + index + ": ");
			int number = input.nextInt();

			array[index] = number;

		}

		int checker;

		do {

		System.out.print("Enter a value to check if it is an array element, or enter -1 to quit: ");
		checker = input.nextInt();

		for (int arrayNumber : array) {

			if (arrayNumber == checker) {
				System.out.println("Yes, your value is present in the array");
				break;
			
			}

		}

		int falseCounter = 0;

		for (int arrayNumber : array) {

			if (arrayNumber != checker) {
				falseCounter++;
			
			}

		}

		if (falseCounter == size) System.out.println("No, your value is not present in the array");

		} while (checker != -1);

	}

}