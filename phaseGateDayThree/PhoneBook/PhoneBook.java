import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {

	private ArrayList<String> contactFirstNames = new ArrayList<>();
	private ArrayList<String> contactLastNames = new ArrayList<>();
	private ArrayList<String> contactPhoneNumbers = new ArrayList<>();
	private Scanner input = new Scanner(System.in);
	

	public PhoneBook() {}

	public void mainMenu() {

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.print("""

			Afeez's Contacts

			Select:

			1. Add contact
			2. Remove contact
			3. Edit contact
			4. View contact
			5. Find contact by Phone No.
			6. Find contact by First Name
			7. Find contact by Last Name

			Type 'X' to quit

		""");
		String userInput = input.nextLine();

		switch (userInput.toUpperCase()) {

			case "1":
				addContact();
				break;

			case "2":
				removeContact();
				break;

			case "3":
				editContact();
				break;

			case "4":
				viewContact();
				break;

			case "5":
				findByNum();
				break;

			case "6":
				findByFName();
				break;

			case "7":
				findByLName();
				break;

			case "X":
				System.out.print("\033[H\033[2J");
      				System.out.flush();
				break;

			default:
				System.out.println("Invalid input");
				mainMenu();

		}

	}

	public void addContact() {

		String newContactFirstName = "";
		String newContactLastName = "";
		String newContactNumber = "";

		while (true) {

			System.out.print("\033[H\033[2J");
      			System.out.flush();

			System.out.println("Add Contact\n");

			System.out.println("Enter new contact's first name:");
			newContactFirstName = input.nextLine();

			System.out.println("Enter new contact's last name:");
			newContactLastName = input.nextLine();

			System.out.println("Enter new contact's phone number:");
			newContactNumber = input.nextLine();

			if (isValidNumber(newContactNumber)) break;

			System.out.print("\033[H\033[2J");
      			System.out.flush();
			System.out.println("Phone number either invalid or already exists under another contact");

		}

		this.contactFirstNames.add(newContactFirstName);
		this.contactLastNames.add(newContactLastName);
		this.contactPhoneNumbers.add(newContactNumber);

		System.out.print("Contact saving");
		for (int delays = 0; delays < 3; delays++) {

			System.out.print("...");

			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {

				System.out.println("\nSaving Interrupted");

			}

		}

		System.out.print("\033[H\033[2J");
      		System.out.flush();
		System.out.println("\nContact Saved");
		mainMenu();

	}

	public boolean isValidNumber(String number) {

		for (char ch : number.toCharArray()) {

			if (!Character.isDigit(ch)) return false;

		}

		if (number.length() != 11) return false;

		for (String phoneNumber : contactPhoneNumbers) {

			if (number == phoneNumber) return false;

		}

		return true;

	}

	public void removeContact() {

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.println("Remove Contact\n");

		System.out.println("Enter Contact's First OR Last Name OR Contact's Phone Number, or type 'X' to return to Main Menu:");
		String userInput = input.nextLine();

		if (contactFirstNames.contains(userInput)) {

			fNamesRemove(userInput);

			try {
				Thread.sleep(2000);
			}

			catch (InterruptedException e) {

				System.out.println("\nRemoval Interrupted");

			}

			mainMenu();

		}

		else if (contactLastNames.contains(userInput)) {

			lNamesRemove(userInput);

			try {
				Thread.sleep(2000);
			}

			catch (InterruptedException e) {

				System.out.println("\nRemoval Interrupted");

			}

			mainMenu();

		}

		else if (contactPhoneNumbers.contains(userInput)) {

			numbersRemove(userInput);

			try {
				Thread.sleep(2000);
			}

			catch (InterruptedException e) {

				System.out.println("\nRemoval Interrupted");

			}

			mainMenu();

		}

		else if (userInput.toUpperCase().equals("X")) {

			mainMenu();

		}

		System.out.println("Contact information cannot be found, try again/n");
		removeContact();

	}

	public void fNamesRemove(String userInput) {

		int contactIndex = contactFirstNames.indexOf(userInput);

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		displayContactInfo(contactIndex);

		System.out.println("Enter 'Y' to remove this contact, or any other key to return:");
		String response = input.nextLine();

		if (response.toUpperCase().equals("Y")) {

			contactFirstNames.remove(contactIndex);
			contactLastNames.remove(contactIndex);
			contactPhoneNumbers.remove(contactIndex);

			System.out.println("Contact Removed");

		}

		else removeContact();

	}

	public void lNamesRemove(String userInput) {

		int contactIndex = contactLastNames.indexOf(userInput);

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		displayContactInfo(contactIndex);

		System.out.println("Enter 'Y' to remove this contact, or any other key to return:");
		String response = input.nextLine();

		if (response.toUpperCase().equals("Y")) {

			contactFirstNames.remove(contactIndex);
			contactLastNames.remove(contactIndex);
			contactPhoneNumbers.remove(contactIndex);

			System.out.println("Contact Removed");

		}

		else removeContact();

	}

	public void numbersRemove(String userInput) {

		int contactIndex = contactPhoneNumbers.indexOf(userInput);

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		displayContactInfo(contactIndex);

		System.out.println("Enter 'Y' to remove this contact, or any other key to return:");
		String response = input.nextLine();

		if (response.toUpperCase().equals("Y")) {

			contactFirstNames.remove(contactIndex);
			contactLastNames.remove(contactIndex);
			contactPhoneNumbers.remove(contactIndex);

			System.out.println("Contact Removed");

		}

		else removeContact();

	}

	public void displayContactInfo(int index) {

		System.out.printf("""

		Contact Info:

		First Name: %s
		Last Name: %s
		Phone No.: %s

		""", contactFirstNames.get(index), contactLastNames.get(index), contactPhoneNumbers.get(index));

	}

	public void editContact() {

		System.out.println("Edit Contact\n");

		System.out.println("Enter Contact's First OR Last Name OR Contact's Phone Number, or type 'X' to return to Main Menu");
		String userInput = input.nextLine();

		if (contactFirstNames.contains(userInput)) {

			fNamesEdit(userInput);

			try {
				Thread.sleep(2000);
			}

			catch (InterruptedException e) {

				System.out.println("\nRemoval Interrupted");

			}

			mainMenu();

		}

		else if (contactLastNames.contains(userInput)) {

			lNamesEdit(userInput);

			try {
				Thread.sleep(2000);
			}

			catch (InterruptedException e) {

				System.out.println("\nRemoval Interrupted");

			}

			mainMenu();

		}

		else if (contactPhoneNumbers.contains(userInput)) {



			numbersEdit(userInput);

			try {
				Thread.sleep(2000);
			}

			catch (InterruptedException e) {

				System.out.println("\nRemoval Interrupted");

			}

			mainMenu();

		}

		else if (userInput.toUpperCase().equals("X")) mainMenu();

		System.out.println("Contact information cannot be found, try again/n");
		editContact();

	}

	public void fNamesEdit(String userInput) {

		int contactIndex = contactFirstNames.indexOf(userInput);

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		displayContactInfo(contactIndex);

		System.out.println("Enter 'Y' to edit this contact, or any other key to return:");
		String response = input.nextLine();

		if (response.toUpperCase().equals("Y")) {

			String newContactFirstName = "";
			String newContactLastName = "";
			String newContactNumber = "";

			while (true) {

				System.out.println("Add Contact\n");

				System.out.println("Enter contact's new first name:");
				newContactFirstName = input.nextLine();

				System.out.println("Enter contact's new last name:");
				newContactLastName = input.nextLine();

				System.out.println("Enter contact's new phone number:");
				newContactNumber = input.nextLine();

				if (isValidNumber(newContactNumber)) break;

				System.out.println("Phone number either invalid or already exists under another contact");

			}

			this.contactFirstNames.set(contactIndex, newContactFirstName);
			this.contactLastNames.set(contactIndex, newContactLastName);
			this.contactPhoneNumbers.set(contactIndex, newContactNumber);

			System.out.print("Contact saving");
			for (int delays = 0; delays < 3; delays++) {

				System.out.print("...");

				try {
				Thread.sleep(1000);
				}

				catch (InterruptedException e) {

					System.out.println("\nSaving Interrupted");
	
				}

			}

		System.out.println("\nContact Saved");
		mainMenu();			

		}

		else editContact();

	}

	public void lNamesEdit(String userInput) {

		int contactIndex = contactLastNames.indexOf(userInput);

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		displayContactInfo(contactIndex);

		System.out.println("Enter 'Y' to edit this contact, or any other key to return:");
		String response = input.nextLine();

		if (response.toUpperCase().equals("Y")) {

			String newContactFirstName = "";
			String newContactLastName = "";
			String newContactNumber = "";

			while (true) {

				System.out.println("Add Contact\n");

				System.out.println("Enter contact's new first name:");
				newContactFirstName = input.nextLine();

				System.out.println("Enter contact's new last name:");
				newContactLastName = input.nextLine();

				System.out.println("Enter contact's new phone number:");
				newContactNumber = input.nextLine();

				if (isValidNumber(newContactNumber)) break;

				System.out.println("Phone number either invalid or already exists under another contact");

			}

			this.contactFirstNames.set(contactIndex, newContactFirstName);
			this.contactLastNames.set(contactIndex, newContactLastName);
			this.contactPhoneNumbers.set(contactIndex, newContactNumber);

			System.out.print("Contact saving");
			for (int delays = 0; delays < 3; delays++) {

				System.out.print("...");

				try {
				Thread.sleep(1000);
				}

				catch (InterruptedException e) {

					System.out.println("\nSaving Interrupted");
	
				}

			}

		System.out.println("\nContact Saved");
		mainMenu();			

		}

		else editContact();

	}

	public void numbersEdit(String userInput) {

		int contactIndex = contactPhoneNumbers.indexOf(userInput);

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		displayContactInfo(contactIndex);

		System.out.println("Enter 'Y' to edit this contact, or any other key to return:");
		String response = input.nextLine();

		if (response.toUpperCase().equals("Y")) {

			String newContactFirstName = "";
			String newContactLastName = "";
			String newContactNumber = "";

			while (true) {

				System.out.println("Add Contact\n");

				System.out.println("Enter contact's new first name:");
				newContactFirstName = input.nextLine();

				System.out.println("Enter contact's new last name:");
				newContactLastName = input.nextLine();

				System.out.println("Enter contact's new phone number:");
				newContactNumber = input.nextLine();

				if (isValidNumber(newContactNumber)) break;

				System.out.println("Phone number either invalid or already exists under another contact");

			}

			this.contactFirstNames.set(contactIndex, newContactFirstName);
			this.contactLastNames.set(contactIndex, newContactLastName);
			this.contactPhoneNumbers.set(contactIndex, newContactNumber);

			System.out.print("Contact saving");
			for (int delays = 0; delays < 3; delays++) {

				System.out.print("...");

				try {
				Thread.sleep(1000);
				}

				catch (InterruptedException e) {

					System.out.println("\nSaving Interrupted");
	
				}

			}

		System.out.println("\nContact Saved");
		mainMenu();			

		}

		else editContact();

	}

	public void viewContact() {

		

		System.out.println("View Contact\n");

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.println("Enter Contact's First OR Last Name OR Contact's Phone Number, or type 'X' to return to Main Menu");
		String userInput = input.nextLine();

		if (contactFirstNames.contains(userInput)) {

			int contactIndex = contactFirstNames.indexOf(userInput);
			displayContactInfo(contactIndex);

			System.out.println("Enter 'V' to view another contact, or any other key to return to Main Menu");
			if (input.nextLine().toUpperCase().equals("V")) viewContact();

			mainMenu();

		}

		if (contactLastNames.contains(userInput)) {

			int contactIndex = contactLastNames.indexOf(userInput);
			displayContactInfo(contactIndex);

			System.out.println("Enter 'V' to view another contact, or any other key to return to Main Menu");
			if (input.nextLine().toUpperCase().equals("V")) viewContact();

			mainMenu();

		}

		if (contactPhoneNumbers.contains(userInput)) {

			int contactIndex = contactPhoneNumbers.indexOf(userInput);
			displayContactInfo(contactIndex);

			System.out.println("Enter 'V' to view another contact, or any other key to return to Main Menu");
			if (input.nextLine().toUpperCase().equals("V")) viewContact();

			mainMenu();

		}

		System.out.println("Contact information cannot be found, try again/n");
		viewContact();

	}

	public void findByFName() {

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.println("Enter Contact's First Name:");
		String userInput = input.nextLine();

		if (contactFirstNames.contains(userInput)) {

			int contactIndex = contactFirstNames.indexOf(userInput);
			displayContactInfo(contactIndex);

			System.out.println("Enter 'Y' to view another contact, or any other key to return to Main Menu:");
			if (input.nextLine().toUpperCase().equals("Y")) findByFName();
			else mainMenu();

		}

		System.out.println("Contact information cannot be found, try again/n");
		findByFName();

	}

	public void findByLName() {

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.println("Enter Contact's Last Name:");
		String userInput = input.nextLine();

		if (contactLastNames.contains(userInput)) {

			int contactIndex = contactLastNames.indexOf(userInput);
			displayContactInfo(contactIndex);

			System.out.println("Enter 'Y' to view another contact, or any other key to return to Main Menu:");
			if (input.nextLine().toUpperCase().equals("Y")) findByLName();
			else mainMenu();

		}

		System.out.println("Contact information cannot be found, try again/n");
		findByLName();

	}

	public void findByNum() {

		System.out.print("\033[H\033[2J");
      		System.out.flush();

		System.out.println("Enter Contact's Phone No.:");
		String userInput = input.nextLine();

		if (contactPhoneNumbers.contains(userInput)) {

			int contactIndex = contactPhoneNumbers.indexOf(userInput);
			displayContactInfo(contactIndex);

			System.out.println("Enter 'Y' to view another contact, or any other key to return to Main Menu:");
			if (input.nextLine().toUpperCase().equals("Y")) findByNum();
			else mainMenu();

		}

		System.out.println("Contact information cannot be found, try again/n");
		findByNum();

	}

}