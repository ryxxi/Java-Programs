import java.util.Scanner;

public class Awards {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter place you finished: ");
		int place = input.nextInt();

		switch (place) {
			case 1:
				System.out.println("Gold Medal");
				break;
			case 2:
				System.out.println("Silver Medal");
				break;
			case 3:
				System.out.println("Bronze Medal");
				break;
			default:
				System.out.println("Participation Ribbon");

		}

	}

}