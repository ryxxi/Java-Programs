public class ListOfMultiples {

	public static void main(String... args) { 

		System.out.println("number	square	cube");

		int number = -1;
		int numberCounter = 0;

		while ( numberCounter <= 10) {
		number = number + 1;
		int square = number * number;
		int cube = number * number * number;
		System.out.printf("%d	%d	%d%n", number, square, cube);
		numberCounter = numberCounter + 1;
		}

	}

}