import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight(kg): ");
		double weightKG = input.nextDouble();

		System.out.print("Enter height(m): ");
		double heightMTR = input.nextDouble();

		double bMI = weightKG / ( heightMTR * heightMTR );
		
		System.out.printf("Your BMI is %.2f%n", bMI);

		if ( bMI >= 30 ) {
		System.out.println("You are obese");
		}

		else if ( bMI >= 25 ) {
		System.out.println("You are overweight");
		}

		else if ( bMI >= 18.5 ) {
		System.out.println("You are normal weight");
		}

		else {
		System.out.println("You are underweight");
		}

	}

}