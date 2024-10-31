public class EveryOperator { 

	public static void main(String[] args) {

		int x = 10;
		int y = 15;

		System.out.print(y > x? "\nTrue\n": "\nFalse\n");
		if (x > y || x <= y) System.out.println("True");
		else System.out.println("False");
		if (x < y && x >= y) System.out.println("True");
		else System.out.println("False");
		if (x == (y - 5) | x == y) System.out.println("True");
		else System.out.println("False");
		if (x != 10 ^ y == 15 && y < 20) System.out.println("True");
		else System.out.println("False");

	}

}