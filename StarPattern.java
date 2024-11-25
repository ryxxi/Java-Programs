import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter pattern size: ");
		int size = input.nextInt();

		printTwoTriangles(size);

	}

public static void printTwoTriangles(int rows) {

	printUpper(rows);
	printLower(rows + 1);

}

public static void printUpper(int rows) {

	for (int i = 1; i <= rows; i++) {

		printStar(i);
		printNewLine();

	}

}

public static void printLower(int rows) {

	for (int i = rows; i >= 1; i--) {

		printStar(i);
		printNewLine();

	}

}

public static void printStar(int rows) {

	for (int i = 1; i <= rows; i++) {

		printStar();

	}

}

public static void printStar() {

	System.out.print("* ");

}

public static void printNewLine() {

	System.out.println();

}

}