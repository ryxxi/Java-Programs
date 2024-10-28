public class MultiplicationTable {

	public static void main(String[] args) {

		int leftSide = 1;
		int rightSide = 1;
		int product = leftSide * rightSide;

		
		while (leftSide < 10) {
			
			while (rightSide < 10) {			
				product = leftSide * rightSide;
				System.out.printf("%d * %d = %d	", leftSide, rightSide, product);
				rightSide++;

			}

		leftSide++;
		rightSide = 1;
		System.out.println("");

		}

	}

}
		
			