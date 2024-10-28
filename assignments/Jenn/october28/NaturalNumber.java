public class NaturalNumber { 

	public static void main(String[] args) { 

		int sum = 0;
		int incrementinator = 1;
		int additionCounter = 0;
		
		while (additionCounter < 10) {
		sum += incrementinator;
		incrementinator++;
		additionCounter++;
		}

		System.out.printf("Sum of first 10 natural numbers is %d%n", sum);

	}

}