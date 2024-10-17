/**
Author: Leke Opaleye
Created: 16/10/24
Last modified: 17/10/24
Function: Calculate the sum of a numbers digits
*/

public class DigitSum { 
//declaring the class DigitSum

	public static void main(String... args) { 
	//main method declaration

		java.util.Scanner input = new java.util.Scanner(System.in); 
		/*creating a new object of class Scanner which can read inputs from the user's
keyborad*/

		System.out.print("Enter an integer between 0 and 1000: "); //prompting user
		int integer = input.nextInt(); //storing user's input in integer

		if (0 >= integer) {
		System.out.println("Program terminated. Rerun the program and input a value between the provided parameters");
		} //terminating program if values are outside 0-1000

		if (1000 <= integer) {
		System.out.println("Program terminated. Rerun the program and input a value between the provided parameters");
		}

		if (0 < integer && integer < 1000) {
		int digit1 = integer / 100;
		int digit2 = (integer / 10) % 10;
		int digit3 = integer % 10;
		/*this 'if...' statement is separating all the digits to prepare them for
summation*/

		int sum = digit1 + digit2 + digit3;
		//calculating the digits' sum
		
		System.out.printf("Sum of digits is %d%n", sum);
		} //printing the sum of the digits

	}

}
		