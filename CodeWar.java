import java.util.Scanner;
import java.util.ArrayList;

public class CodeWar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		ArrayList<Integer> array = new ArrayList<>();

		while (true);

			System.out.println("Enter an integer to be entered into the array\nor enter 'X' to stop adding:");
			String userInput = input.nextLine();

			if (userInput.toUpperCase().equals("X")) break;

			try {

				int temp = Integer.parseInt(userInput);
				array.add(temp);

			}

			catch (NumberFormatException e) {

				System.out.println("Invalid input, try again");

			}

		System.out.println("Enter an integer that represents a difference between 2 elements");

		System.out.println(getDifferences(array, input.nextInt()));

	}

	public static int[][] getDifferences(ArrayList<Integer> array, int difference) {

		ArrayList<int[]> newArray = new ArrayList<>();

		for (int index = 0; index < array.size(); index++) {

			for (int number : array) {

				if (array.get(index) == number + difference) {

					int[] differencePair = {number, number + difference};
					if (!newArray.contains(differencePair)) newArray.add(differencePair);

				}

			}

		}

		return newArray;

			

}