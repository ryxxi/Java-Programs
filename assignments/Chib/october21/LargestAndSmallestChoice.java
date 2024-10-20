import java.util.Scanner;

public class LargestAndSmallestChoice {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = 0;
		int numberCounter = 0;
		long smallest = 999999999;
		long largest = -999999999;

		System.out.print("Enter an number, or enter -1 to end program: ");
		number = input.nextInt();

		while (number != -1) {
		
			if (number < smallest) {
			smallest = number;
			}

			if (number > largest) {
			largest = number;
			}

		System.out.print("Enter an number, or enter -1 to end program: ");
		number = input.nextInt();

		}

		System.out.printf("Largest is %d%nSmallest is %d%n", largest, smallest);

	}

}