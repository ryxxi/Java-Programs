import java.util.Scanner;

public class Cypher {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a message for encryption:");
		String message = input.nextLine();

		System.out.println("Enter an encryption code:");
		int key = input.nextInt();

		encrypt(message, key);

	}

	public static void encrypt(String message, int key) {

		char[] characters = message.toCharArray();

		for (int i = 0; i < characters.length; i++) {

			characters[i] += key;

		}

		String encryptedMessage = new String(characters);
		System.out.println(encryptedMessage);

	}

	public static void decrypt(String message, int key) {

		char[] characters = message.toCharArray();

		for (int i = 0; i < characters.length; i++) {

			characters[i] -= key;

		}

		String decryptedMessage = new String(characters);
		System.out.println(decryptedMessage);

	}

}