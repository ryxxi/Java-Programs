import java.util.Scanner;

public class LibraryCharge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter how many days late the member is: ");
		int lateBy = input.nextInt();

		if (lateBy >= 30) System.out.print("\nMembership is terminated\n");
		else if (lateBy >= 10) System.out.print("\n5 Rupee Fine\n");
		else if (lateBy >= 6) System.out.print("\n1 Rupee Fine\n");
		else if (lateBy > 0) System.out.print("\n50 Paise Fine\n");
		else System.out.print("\nThank you for returning our book promptly!\n");

	}

}