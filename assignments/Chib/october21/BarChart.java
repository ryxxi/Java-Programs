import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 5 integers from 1-30");
		System.out.print("Enter first integer: ");
		int integer1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int integer2 = input.nextInt();
		System.out.print("Enter third integer: ");
		int integer3 = input.nextInt();
		System.out.print("Enter fourth integer: ");
		int integer4 = input.nextInt();
		System.out.print("Enter fifth integer: ");
		int integer5 = input.nextInt();

		int starCounter = 0;
		
		if (1 < integer1 && integer1 < 30 &&
		1.0 < integer2 && integer2 < 30 &&
		1.0 < integer3 && integer3 < 30 &&
		1.0 < integer4 && integer4 < 30 &&
		1.0 < integer5 && integer5 < 30) {

		while (starCounter < integer1) {
		System.out.print("*");
		starCounter ++;
		}
		
		starCounter = 0;
		System.out.printf("%n");

		while (starCounter < integer2) {
		System.out.print("*");
		starCounter ++;
		}

		starCounter = 0;
		System.out.printf("%n");

		while (starCounter < integer3) {
		System.out.print("*");
		starCounter ++;
		}

		starCounter = 0;
		System.out.printf("%n");

		while (starCounter < integer4) {
		System.out.print("*");
		starCounter ++;
		}

		starCounter = 0;
		System.out.printf("%n");

		while (starCounter < integer5) {
		System.out.print("*");
		starCounter ++;
		}

		System.out.printf("%n");

		}

		else {
		System.out.println("Nuh-uh buddy, I said BETWEEN 1 and 30!\n");
		}
		
	}

}

		