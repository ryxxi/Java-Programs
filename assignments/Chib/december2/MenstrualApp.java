import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.DateTimeFormatter;

public class MenstrualApp {

	private ArrayList<LocalDate> cycleHistory = new ArrayList<>();
	private int cycleLength;
	private Scanner input = new Scanner(System.in);
	private String userName;

	public MenstrualApp(String userName){

		this.userName = userName;

	}

	public String getUserName() {

		return userName;

	}

	public void run() {

		System.out.println("Welcome " + getUserName() + "\n");

		getCycleLength();
		getLastPeriodStart();



		System.out.println("\nHere are your predicted dates:");
		System.out.println("Next Period Start Date: " + nextPeriodDate);
		System.out.println("Ovulation Date: " + ovulationDate);
		System.out.println("Fertile Window: " + fertileStart + " to " + fertileEnd);

		System.out.println("\nCycle History:");
		for (LocalDate date : cycleHistory) {
			System.out.println(date);

	}

	public int getCycleLength() {

		System.out.println("Enter you average cycle length (in days):");
		int cycleLength = input.nextInt();

		return cycleLength;

	}

	public  getLastPeriodStart() {

		System.out.println("Enter the date your last period started (YYYY-MM-dd):");
		String userInput = input.nextLine();
		LocalDate lastPeriodStart = ArrayList<LocalDate>.parse(userInput, DateTimeFormatter.ISO_DATE);

		cycleHistory.add(lastPeriod);

	}

	public setPerioDates() {

		LocalDate nextPeriodStart = cyleHistory.get(0).plusDays(cycleLength);
		LocalDate ovulationStart = cyleHistory.get(0)(cycleLength / 2);
		LocalDate fertileStart = ovulationStart.minusDays(5);
		LocalDate fertileEnd = ovulationStart.plusDays(1);

	}

}