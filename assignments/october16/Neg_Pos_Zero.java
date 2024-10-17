import java.util.Scanner;

public class Neg_Pos_Zero { 

	public static void main(String... args) { 

		Scanner input = new Scanner(System.in);

		int negCounter = 0;
		int zeroCounter = 0;
		int posCounter = 0;
		int numbCounter = 0;

		while ( numbCounter < 5 ) {
		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		
		if ( number < 0 ) {
		negCounter = negCounter + 1;
		}

		else if ( number == 0 ) {
		zeroCounter = zeroCounter + 1;
		}

		else {
		posCounter = posCounter + 1;
		}
		
		numbCounter = numbCounter + 1;

		}

		System.out.printf("%nThere are %d negative numbers%n", negCounter);
		System.out.printf("There are %d zeros%n", zeroCounter);
		System.out.printf("There are %d positive numbers%n%n", posCounter);

	}

}