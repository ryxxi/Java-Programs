import java.util.Scanner;

public class CounterRevision {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double total = 0;
		int counter = 0;

		System.out.print("Enter an integer or type ("-1") to quit: ");
		double integer = input.nextDouble

		while (integer != -1) {
		
		total = total + integer;
		counter = counter + 1;

		System.out.print("Enter an integer or type ("-1") to quit: ");	
		integer = input.nextDouble

		}

		double mean = total / 5;
		System.out.println(mean);

	}

}