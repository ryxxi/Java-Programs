import java.util.Scanner;

public class Neg_Pos_Zero {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int negCounter = 0;
		int zeroCounter = 0;
		int posCounter = 0;
		int numCounter = 0;

		while ( numCounter < 5 ) {
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
		
		numCounter = numCounter + 1;

		}

		System.out.printf("%nThere is/are %d negative number(s)%n", negCounter);
		System.out.printf("There is/are %d zero(s)%n", zeroCounter);
		System.out.printf("There is/are %d positive number(s)%n%n", posCounter);

	}

}