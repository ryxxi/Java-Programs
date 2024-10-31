public class TaskEight{ 

	public static void main(String[] args) {

		double number = 4;
		double sum = 0;
		double newNumber = 0;

		for (int i = 1; i <= 2; i++) {
	
		newNumber = number + Math.pow(number, 2) + Math.pow(number, 3) + Math.pow(number, 4) + Math.pow(number, 5);
		sum += newNumber;
		number+=4;
			
		}

		System.out.printf("%.0f", sum);

	}

}

		