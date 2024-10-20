public class DigitSum { 

	public static void main(String... args) {

		java.util.Scanner input = new java.util.Scanner(System.in); 

		System.out.print("Enter an integer between 0 and 1000: ");
		int integer = input.nextInt();

		if (0 >= integer) {
		System.out.println("Program terminated. Rerun the program and input a value between the provided parameters");
		}

		if (1000 <= integer) {
		System.out.println("Program terminated. Rerun the program and input a value between the provided parameters");
		}

		int digit1 = 0;
		int digit2 = 0;
		int digit3 = 0;

		if (0 < integer && integer < 1000) {
		digit1 = integer / 100;
		digit2 = (integer / 10) % 10;
		digit3 = integer % 10;
		}

		int sum = digit1 + digit2 + digit3;
		
		System.out.printf("Sum of digits is %d%n", sum);

	}

}
		