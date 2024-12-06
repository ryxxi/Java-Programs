import java.util.Scanner;

public class CreditCard {

	private String cardType;
	private String cardNumber;
	private int cardNumberLength;
	private String cardValidity;

	public CreditCard(String cardNumber) {
		this.cardNumber = cardNumber;
		cardNumberLength = cardNumber.length();
	}

	public void getCardType(String cardNumber) {
		if (cardNumber.startsWith("4")) cardType = "Visa";
		else if (cardNumber.startsWith("5")) cardType = "MasterCard";
		else if (cardNumber.startsWith("6")) cardType = "Discover";
		else if (cardNumber.startsWith("37")) cardType = "American Express";
		else cardType = "Invalid Card";
	}

	public void getCardValidity(String cardNumber) {
		if (cardNumberLength < 13 || cardNumberLength > 16) {
			cardValidity = "Invalid";
			return;
		}

		int total = 0;
		char[] cardDigit = cardNumber.toCharArray();

		for (int index = (cardDigit.length - 2); index >= 0; index -= 2) {
			int temp = Integer.parseInt(String.valueOf(cardDigit[index])) * 2;

			if (temp < 10) total += temp;

			else {
				total++;
				total += temp % 10;
			}
		}

		System.out.print(total);

		for (int index = (cardDigit.length - 1); index >= 0; index -= 2) {
			total += Integer.parseInt(String.valueOf(cardDigit[index]));
		}

		System.out.print(total);

		if (total % 10 == 0) {
			cardValidity = "Valid";
			return;
		}

		

		cardValidity = "Invalid";
	}

	public void clear() {
		System.out.print("\033[H\033[2J");
      		System.out.flush();
	}

	public void delay(int milliseconds) {
		try {
			Thread.sleep(milliseconds);

		} catch (InterruptedException e) {
			System.out.println("Error");
		}
	}

	public void printStars(int stars) {
		for (int i = 0; i < stars; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public void printCardDetails(String cardNumber) {
		getCardType(cardNumber);
		getCardValidity(cardNumber);
		
		clear();
		delay(2000);
		printStars(30);
		System.out.printf("Card Type: %s%n", cardType);
		System.out.printf("Card Number: %s%n", cardNumber);
		System.out.printf("Card Digit Length: %s%n", cardNumberLength);
		System.out.printf("Card Validity Status: %s%n", cardValidity);
		printStars(30);
	}
}


		














