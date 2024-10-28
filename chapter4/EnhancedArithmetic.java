import java.util.Scanner;

public class EnhancedArithmetic {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer: ");
		int num = input.nextInt();
		int largest = num;
		int smallest = num;

		String anyPrime = "";
		
		int total = num;
		int counter = 0;

		while (counter < 2) {
		System.out.print("Input an integer: ");
		num = input.nextInt();
		
		if (num > largest) largest = num;
		if (num < smallest) smallest = num;
		
		total += num;
		double avg = total / 3;

		if (num > largest) largest = num;
		if (num < smallest) smallest = num;
		
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i != 0) {
				anyPrime = "True";
				}
				else anyPrime = "False";
			}

		counter++;

		}

		double avg = total / 3;
		
		System.out.printf("Total: %d%nMean: %.2f%nLargest: %d%nSmallest: %d%nAny prime number: %s%n", total, avg, largest, smallest, anyPrime);

	}

}



		