import java.util.Scanner;
import java.text.CharacterIterator;

public class LetterRhombus {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		int i;
		int j;
		int k = 0;
		int l;
		int m;

		char firstLetter = 'A';
		char letter = '@';
		char finalLetter;

		for (i = 1; i < integer; i++) {

			for (j = 1; j < (integer - i); j++) {
				System.out.print(" ");
			}

			for (k = 0; k < i; k++) {
				System.out.print(firstLetter);
				firstLetter++;
			}

			finalLetter = (char) (letter + (i - 1));

			for (l = 1; l < k; l++) {
				System.out.print(finalLetter);
				finalLetter--;
			}

			System.out.println("");
			firstLetter = 'A';
			letter = '@';
			finalLetter = letter+=(i);

		}

		i = 0;
		j = 0;
		k = 0;
		l = 0;
		m = 0;

		letter = '@';
		firstLetter = 'A';
		
		for (i = integer; i >= 1; i--) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (k = 0; k < i; k++) {
				System.out.print(firstLetter);
				firstLetter++;
			}

			finalLetter = (char) (letter + (i - 1));

			for (l = 1; l < k; l++) {
				System.out.print(finalLetter);
				finalLetter--;
			}

			System.out.println("");
			firstLetter = 'A';

		}

	}

}