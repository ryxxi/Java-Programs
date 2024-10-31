public class TaskSixWhile {

	public static void main(String[] args) {

		double number = 4;

		while (number <= 8) {
		System.out.printf("%.0f %.0f %.0f %.0f %.0f ",number, Math.pow(number, 2), Math.pow(number, 3), Math.pow(number, 4), Math.pow(number, 5));
		number+=4;
		}

	}

}