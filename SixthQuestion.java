import java.util.Scanner;

public class SixthQuestion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String literalUserName = input.nextLine();

		System.out.println("Hi" + literalUserName + ", nice to meet you!");
		System.out.print("Hi" + literalUserName + ", nice to meet you!");
		System.out.printf("%nHi %s, nice to meet you!", literalUserName);
	}

}