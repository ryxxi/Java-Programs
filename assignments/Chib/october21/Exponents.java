import java.util.Scanner;

public class Exponents {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer base: ");
		long base = input.nextInt();

		System.out.print("Enter an integer exponent: ");
		int exponent = input.nextInt();

		int counter = 1;
		long result = base;

		if (exponent < 0) { 

		exponent = -(exponent);
			while (counter < exponent) {
			result *= base;
			counter++;
			}

		exponent = -(exponent);
		}

		if (exponent > 0){

			while (counter < exponent) {
			result *= base;
			counter++;
			}
			
		}

		if (exponent == 0) { 
		result = 1;
		}

		if (exponent >= 0){
		System.out.printf("The result of %d raised to the power of %d is %d%n", base, exponent, result);
		}

		else{
		System.out.printf("The result of %d raised to the power of %d is 1/%d%n", base, exponent, result);
		}
	
	}

}