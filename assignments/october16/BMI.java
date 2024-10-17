/**
Author: Leke Opaleye
Created: 16/10/24
Last modified: 17/10/24
Function: Calculating and displaying BMI
*/

import java.util.Scanner; //retrieving Scanner class from java.util package

public class BMI { //declaring the class

	public static void main(String[] args) { //declaring main method

		Scanner input = new Scanner(System.in); /*creating an object of the Scanner
class that can read user inputs from the keyboard*/

		System.out.print("Enter height(m): ");
		double heightMTR = input.nextDouble();

		System.out.print("Enter weight(kg): "); //prompting the user
		double weightKG = input.nextDouble(); /*collecting and storing the input in
variable number1*/

		double bMI = weightKG / ( heightMTR * heightMTR ); //calculating BMI
		
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
		//displaying BMI and their subsequent weight category

	}

}