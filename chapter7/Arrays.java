public class Arrays {

	public static void main(String... args) {

		int[] array = new int [6];

		int a = counter;
		int b = array[counter];
		int result = counter;

		for(int counter = 0; counter < array.length; counter++) {
		array[counter] = counter + 1;
		}

		System.out.printf("%s%8s%8s%n", "a", "b", "pow(a, b)");

		for(int counter = 0; counter < array.length; counter++) {
			while(a < b) {
			result *= a;
			a++;
			}
		array[counter] = counter + 1;
		System.out.printf("%d%8d%8d%n", a, b, result);
		}

	}

}