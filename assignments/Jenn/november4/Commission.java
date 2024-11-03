import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many of Item 1 were sold?: ");
		int itemOneSold = input.nextInt();

		System.out.print("How many of Item 2 were sold?: ");
		int itemTwoSold = input.nextInt();

		System.out.print("How many of Item 3 were sold?: ");
		int itemThreeSold = input.nextInt();

		System.out.print("How many of Item 4 were sold?: ");
		int itemFourSold = input.nextInt();

		double itemOne = 239.99;
		double itemTwo = 129.75;
		double itemThree = 99.95;
		double itemFour = 350.89;
		double total = 0;

		while (itemOneSold > 0) {
			total += itemOne;
			itemOneSold--;
		}

		while (itemTwoSold > 0) {
			total += itemTwo;
			itemTwoSold--;
		}

		while (itemThreeSold > 0) {
			total += itemThree;
			itemThreeSold--;
		}

		while (itemFourSold > 0) {
			total += itemFour;
			itemFourSold--;
		}

		double earnings = 200 + (0.09 * total);

		System.out.printf("%nLast week you sold $%.2f of products, thus your earnings are $%.2f%n%n", total, earnings);

	}

}