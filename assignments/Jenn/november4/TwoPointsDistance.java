import java.util.Scanner;

public class TwoPointsDistance {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input x and y coordinates of Point 1: ");
		int pointOneX = input.nextInt();
		int pointOneY = input.nextInt();

		System.out.print("Input x and y coordinates of Point 2: ");
		double pointTwoX = input.nextInt();
		double pointTwoY = input.nextInt();

		String perpendicular = "aren't";

		double distanceSquared = Math.pow((pointTwoX - pointOneX), 2) + Math.pow((pointTwoY - pointOneY), 2);
		double distance = Math.pow(distanceSquared, 0.5);

		if ((pointTwoY == pointOneY) || (pointTwoX == pointOneX)) perpendicular = "are";	

		System.out.printf("The distance between the 2 points is %.2f and they %s perpendicular to an axis%n", distance, perpendicular);

	}

}