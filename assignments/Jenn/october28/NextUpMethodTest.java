public class NextUpMethodTest {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Input a floating point number: ");
		double number = input.nextDouble();

		double nextNumber = Math.nextUp(number);

		System.out.printf("Original: %f%nNew: %f%n", number, nextNumber);

	}

}