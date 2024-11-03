import java.util.Scanner;

public class TwoLargest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		double largest = number;
		double secondLargest = 0;
		int counter = 1;

		while (counter < 10) {
		System.out.print("Enter a number: ");
		number = input.nextDouble();

		if (number > largest) {
		secondLargest = largest;
		largest = number;
		}
		
		else if (number > secondLargest) secondLargest = number;
		
		counter++;
		}

		System.out.printf("The largest is %.2f and the second largest is %.2f%n", largest, secondLargest);

	}

}