import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String value = input.nextLine();

		if (value.length() == 1 && Character.isLetter(value.charAt(0))) {
			char letter = Character.toUpperCase(value.charAt(0));
			

			if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
			System.out.println("Vowel");
			}

			else System.out.println("Consonant");

		}

		else System.out.print("Error. Enter a single letter.\n");
		
	}

}