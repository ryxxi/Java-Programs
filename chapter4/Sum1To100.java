public class Sum1To100 {

	public static void main(String[] args) {

		int numCounter = 0;
		int num = 1;
		int sum = 0;
		
		while ( numCounter < 100 ) {
		sum = sum + num;
		num = num + 1;
		numCounter = numCounter + 1;
		}

		System.out.printf("Sum of number 1-100 is:%n%d%n", sum);
	
	}

}
		