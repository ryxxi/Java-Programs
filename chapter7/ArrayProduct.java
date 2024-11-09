public class ArrayProduct {

	public static void main(String[] args) {

	System.out.println("Index\tValue");

	final int ARRAY_SIZE = 4;

	int[] nums = new int[ARRAY_SIZE];
	nums[0] = 1;
	nums[1] = 2;
	nums[2] = 3;
	nums[3] = 4;	

	int[] answer = new int [ARRAY_SIZE];

	int product = 1;

	for (int i = 0; i < ARRAY_SIZE; i++) {
		product *= nums[i];
	}

	for (int j = 0; j < ARRAY_SIZE; j++) {
		answer[j] = product / nums[j];
		System.out.println(j + "\t" + answer[j]);
	}

	}

}