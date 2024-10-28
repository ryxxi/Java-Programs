import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int counter = 0;

		while (counter < 6) {
		System.out.printf("%d x %d = %d%n", number, counter, number*counter);
		counter++;
		}

	}

}