/**
Author: Leke Opaleye
Created: 30/09/24
Last modified: 17/10/24
Function: Convert feet to metres
*/

import java.util.Scanner;
//retrieving Scanner class from java.util package

public class FeetToMetres { 
//declaring the class

	public static void main(String[] args) { 
	//declaring main method

		Scanner input = new Scanner(System.in);
	/*creating an object of the Scanner
	  class that can read user inputs from the keyboard*/

		System.out.print("Enter your Distance in Feet: "); //prompting the user
		double distanceInFeet = input.nextDouble();

		double distanceInMetres = distanceInFeet * 0.305; 
		//converting feet to metres

		System.out.printf("Distance in Metres is %f%n", distanceInMetres); 
		//displaying the result

	}

}