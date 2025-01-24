public class PosNegZero {

	public String posNegZero(int[] elements) {

		int positives = 0;
		int negatives = 0;
		int zeros = 0;

		for (int value : elements) {

			if (value == 0) zeros++;
			else if (value > 0) positives ++;
			else negatives++;

		}

		return String.format("""
			Positives: %d
			Negatives: %d
			Zeros: %d""", positives, negatives, zeros);

	}

}