import java.util.Scanner;
import java.util.Arrays;

public class AlternatingArrays {

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

		alternateBetween(array1, array2);

	}

	public static void alternateBetween(Object[] obj1, Object[] obj2) {

		int length = obj1.length + obj2.length;
		Object[] newArray = new Object[length];
		
		int i = 0, j = 0, k = 0;

		while (i < obj1.length && j < obj2.length) {

			newArray[k++] = obj1[i++];
			newArray[k++] = obj2[j++];

		}

		while (i < obj1.length) {

			newArray[k++] = obj1[i++];

		}

		while (j < obj2.length) {

			newArray[k++] = obj2[j++];

		}

		System.out.println(Arrays.toString(newArray));

	}

}
		





		