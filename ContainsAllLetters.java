public class ContainsAllLetters {

	public static boolean checkAllLetters(String userInput) {

		int length = userInput.length();

		if (length < 26) return false;

		boolean isPresent = false;
		boolean areAllPresent = true;

		for (char letter = 'a'; letter <= 'z'; letter++) {

			for (int index = 0; index < length; index++) {

				if (userInput.toLowerCase().charAt(index) == letter) {

					isPresent = true;
					break;

				}

			}

			if (!isPresent) {

				areAllPresent = false;
				break;

			}

			isPresent = false;

		}

		return areAllPresent;

	}

}

				