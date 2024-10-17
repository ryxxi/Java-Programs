/**
Author: Leke Opaleye
Created: 16/10/24
Last modified: 17/10/24
Function: Determining the nature of 5 numbers
*/

import java.util.Scanner; //retrieving Scanner class from java.util package

public class Neg_Pos_Zero { //declaring the class

	public static void main(String... args) { //declaring the main method

		Scanner input = new Scanner(System.in); //creating an object of the Scanner class that can read user inputs from the keyboard

		int negCounter = 0;
		int zeroCounter = 0;
		int posCounter = 0;
		int numCounter = 0;

		while ( numCounter < 5 ) {
		System.out.print("Enter a number: "); 
		double number = input.nextDouble();
		//prompting the user to enter integers until 5 have been entered, then storing them
		
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
		//determining the nature of each number input by the user

		System.out.printf("%nThere are %d negative numbers%n", negCounter);
		System.out.printf("There are %d zeros%n", zeroCounter);
		System.out.printf("There are %d positive numbers%n%n", posCounter);
		//printing the results

	}

}