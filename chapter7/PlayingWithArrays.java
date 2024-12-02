import java.util.Scanner;

public class PlayingWithArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first array size: ");
		int sizeOne = input.nextInt();

		System.out.print("Enter second array size: ");
		int sizeTwo = input.nextInt();

		int[][] array = new int[sizeOne][sizeTwo];

		for (int row = 0; row < 2; row++) {

			for (int column = 0; column < sizeTwo; column++) {

				System.out.printf("Enter a value for the second array's index%d: ", column);
				int value = input.nextInt();

				array[row][column] = value;

			}

		}

	}

}