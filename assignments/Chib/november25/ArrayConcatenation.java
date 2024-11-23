import java.util.Scanner;

public class ArrayConcatenation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array1 size: ");
		int size1 = input.nextInt();

		Object[] array1 = new Object[size1];

		for (int index = 0; index < size1; index++) {

			System.out.printf("Enter an integer for index %d: ", index);
			int value = input.nextInt();

			array1[index] = value;

		}


		System.out.print("Enter array2 size: ");
		int size2 = input.nextInt();

		Object[] array2 = new Object[size2];

		for (int index = 0; index < size2; index++) {

			System.out.printf("Enter an integer for index %d: ", index);
			int value = input.nextInt();

			array2[index] = value;

		}

		concatenateArrays(array1, array2);

	}

	public static void concatenateArrays(Object[] object1, Object[] object2) {

		int length = object1.length + object2.length;
		Object[] newArray = new Object[length];

		System.arraycopy(object1, 0, newArray, 0, object1.length);
		System.arraycopy(object2, 0, newArray, object1.length, object2.length);

		for (Object element : newArray) {

			System.out.println(element);

		}

	}

}