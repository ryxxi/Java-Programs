/**
Author: Leke Opaleye
Created: 30/09/24
Last modified: 17/10/24
Function: Determining palindromes
*/

import java.util.Scanner; //retrieving Scanner class from java.util package

public class Palindrome { //declaring the class

	public static void main(String[] args) { //declaring the main method

		Scanner input = new Scanner(System.in); /*creating an object of the Scanner
class that can read user inputs from the keyboard*/

		System.out.print("Enter 3 digit integer: "); //prompting the user
		int number1 = input.nextInt(); //collecting and storing the input in variable number1

		int digit1 = number1 / 100; //dividing number1 by 100 to obtain digit1

		int digit3 = number1 % 10; //remainder number1 by 10 to obtain digit3

		if (digit1 == digit3) {
		System.out.println("Your number is a palindrome");
		} //the first and last digits are equal, thus you have a palindrome

		if (digit1 != digit3) {
		System.out.println("Your number is not a palindrome");
		} //the first and last digits aren't equal, thus you do not have a palindrome

	}

}