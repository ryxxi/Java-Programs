public class ReverseMultiplicationTable {

	public static void main(String[] args) {

		System.out.println("\t12\t11\t10\t9\t8\t7\t6\t5\t4\t3\t2\t1");

		int counter = 12;

		for (int multiplier = 1; multiplier < 13; multiplier++) {

			System.out.print(multiplier);
			for (int multiple = 1; multiple < 13; multiple++) {

				System.out.print("\t" + multiplier * counter);
				counter-=1;
			}

			System.out.println();
			counter = 12;

		}

	}

}

		