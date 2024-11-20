import java.util.Scanner;

public class DuplicateRemoverArrays { 

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input array size: ");
		int size = input.nextInt();

		int[] array = new int[size];

		for (int index = 0; index < size; index++) {

			System.out.printf("Input an integer for index %d: ", index);
			int number = input.nextInt();

			array[index] = number;	

		}

		System.out.println();

		System.out.println("Original Array\n");
		System.out.println("Index\tValue");

		for (int index = 0; index < size; index++) {
			System.out.println(index + "\t" + array[index]);
		}

		int duplicateCounter = 0;
		
		for (int index = 0; index < size; index++) {

			for (int arrayValue : array) {

				if (arrayValue == array[index]) {
					duplicateCounter++;
					break;
				}

			}

		}

		duplicateCounter = 0;

		System.out.println();

		System.out.println("New Array\n");
		System.out.println("Index\tValue");
	
		duplicateCounter/=2;

		int newSize = size - duplicateCounter;

		int[] newArray = new int[newSize];
		int newIndex = 0;

		for (int index = 0; index < size; index++) {

			for (int arrayValue : newArray) {

				if (arrayValue == array[index]) {
					duplicateCounter++;
				}
				
			}

			if (duplicateCounter == 0) {
				newArray[newIndex] = array[index];
				System.out.println(newIndex + "\t" + newArray[newIndex]);
				newIndex++;
			}

			duplicateCounter = 0;
			if (newIndex == newSize) break;

		}

			
	}

}
			