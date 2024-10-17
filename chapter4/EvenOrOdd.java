import java.util.Scanner;

public class EvenOrOdd { 

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int remainder = number % 2;

		if ( remainder == 0 ) {
		System.out.println("Your number is even");
		}
		
		else {
		System.out.println("Your number is odd");
		}

	}

}