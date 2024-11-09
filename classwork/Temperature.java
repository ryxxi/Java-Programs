import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature: ");
		int temp = input.nextInt();

		if (temp > 25) System.out.println("Hot");
		else if (temp > 10) System.out.println("Warm");
		else System.out.println("Cold");

	}

}
