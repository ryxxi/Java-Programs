public class ExrrorTest {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter an integer between 0 and 1000: ");
		int integer = input.nextInt();

		if (0 >= integer) {
		System.out.println("Program terminated. Rerun the program and input a value between the provided parameters");
		}

		if (1000 <= integer) {
		System.out.println("Program terminated. Rerun the program and input a value between the provided parameters");
		}

		if (0 < integer && integer < 1000) {
		int digit1 = integer / 100;
		int digit2 = (integer / 10) % 10;
		int digit3 = integer % 10;

		int sum = digit1 + digit2 + digit3;
		
		System.out.printf("Sum of digits is %d%n", sum);
	public static void main(String... args) {

		}

	}

}
		