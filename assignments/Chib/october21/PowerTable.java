public class PowerTable { 

	public static void main(String[] args) {

		System.out.print("a	b	pow(a, b)\n");

		int a = 1;
		int b = 2;
		int result = a;
			
		int counter = 0;
		int powerCounter = 1;

		while (counter < 5) {

			while (powerCounter < b) {
			result *= a;
			powerCounter++;
			}
		
		powerCounter = 1;
		System.out.printf("%d	%d	%d%n", a, b, result);
			
		a++;
		b++;
		result = a;
		counter++;
		}

	}

}