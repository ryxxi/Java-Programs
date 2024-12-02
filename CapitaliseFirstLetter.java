public class CapitaliseFirstLetter {

	public String capitaliseEachWord(String string) {

		String result = "";
		char temp = 'a';

		for (int index = 0; index < string.length(); index++) {

			temp = string.charAt(index);

			if (index == 0 || string.charAt(index - 1) == ' ') {

				temp = string.toUpperCase().charAt(index);

			}

			result += temp;

		}

		return result;

	}

}
		

			

		