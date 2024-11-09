public class ArrayInitialisation {

	public static void main(String[] args) {

		System.out.println("Index\tValue");

		float[] array = new float[4];

		array[0] = 23.1f;
		array[1] = 12.99f;
		array[2] = 5.993f;
		array[3] = 17.5f;

		int index = 0;

		while (index < 4) {
			System.out.println(index + "\t" + array[index]);
			index++;
		}

	}

}
		