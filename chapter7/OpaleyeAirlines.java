import java.util.Scanner;
import java.util.Random;

public class OpaleyeAirlines {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean[] planeSeats = new boolean[10];
		Random random = new Random();

		for (int customer = 0; customer < 10; customer++) {

		System.out.print("""

				Welcome to Opaleye Airlines!

				Thank you for flying with us!

				Please select from out seating options:

				1) First Class
				2) Economy Class

				""");
				char classChoice = input.next().charAt(0);

		switch (classChoice) {

			case '1':

			int seatNumber = random.nextInt(5);

			for (int check = 0; check < 500; check++) {

				if (planeSeats[seatNumber] == false) break;

				else seatNumber = random.nextInt(5);

			}

			if (planeSeats[seatNumber] == false) {

				System.out.printf("""

				Perfect!

				Your seat is:

				Seat %d


				Thanks for flying with Opaleye Airlines!

				""", seatNumber + 1);

				planeSeats[seatNumber] = true;

			}

			else {

				System.out.print("""

				Sorry, it seems all our first class seats are taken

				Would you like an economy seat? (Y/N)

				""");
				classChoice = input.next().charAt(0);

				classChoice = Character.toLowerCase(classChoice);

				switch (classChoice) {

					case 'y':

					seatNumber = random.nextInt(5) + 5;

					if (planeSeats[seatNumber] == false) {

						System.out.printf("""
	
						Perfect!

						Your seat is:

						Seat %d


						Thanks for flying with Opaleye Airlines!

						""", seatNumber + 1);

						planeSeats[seatNumber] = true;

					}

					else {

						System.out.print("""

						I'm sorry, but we're fully booked

						The next departing flight is in 2 hours at 3pm

						Apologies for the inconvenience

						""");

					}
					
					break;

					case 'n':

						System.out.print("""

						The next departing flight is in 2 hours at 3pm.

						Apologies for the inconvenience

						""");

					break;

				}

			}

			break;

			case '2':

			seatNumber = random.nextInt(5) + 5;

			for (int check = 0; check < 500; check++) {

				if (planeSeats[seatNumber] == false) break;

				else seatNumber = random.nextInt(5) + 5;

			}

			if (planeSeats[seatNumber] == false) {

				System.out.printf("""

				Perfect!

				Your seat is:

				Seat %d


				Thanks for flying with Opaleye Airlines!

				""", seatNumber + 1);

				planeSeats[seatNumber] = true;

			}

			else {

				System.out.print("""

				Sorry, it seems all our Economy Class seats are taken

				Would you like a First Class seat? (Y/N)

				""");
				classChoice = input.next().charAt(0);

				classChoice = Character.toLowerCase(classChoice);

				switch (classChoice) {

					case 'y':

					seatNumber = random.nextInt(5);

					if (planeSeats[seatNumber] == false) {

						System.out.printf("""
	
						Perfect!

						Your seat is:

						Seat %d


						Thanks for flying with Opaleye Airlines!

						""", seatNumber + 1);

						planeSeats[seatNumber] = true;

					}

					else {

						System.out.print("""

						I'm sorry, but we're fully booked

						The next departing flight is in 2 hours at 3pm

						Apologies for the inconvenience

						""");

					}
					
					break;

					case 'n':

						System.out.print("""

						The next departing flight is in 2 hours at 3pm.

						Apologies for the inconvenience

						""");

					break;

				}

			}

			break;

		}

		}

	}

}






























































