import java.util.Scanner;

public class MyersBriggsTypeIndicator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MBTIDescriptions switchcaller = new MBTIDescriptions();
		MBTIClear clear = new MBTIClear();

		System.out.println("What is your name?");
		String name = input.nextLine();

		String[] questions = new String[20];
		questions[0] = "A. Expend energy, enjoy groups\t\tB. Conserve energy, enjoy one-on-one";
		questions[1] = "A. Interpret literally\t\tB. Look for meaning and possibilities";
		questions[2] = "A. Logical, thinking, questioning\tB. Empathetic, feeling, accomodating";
		questions[3] = "A. Organised, orderly\t\tB. Flexible, adaptable";
		questions[4] = "A. More outgoing, think out loud\t\tB. More reserved, think to yourself";
		questions[5] = "A. Practical, realistic, experiential\t\tB. Imaginative, innovative, theoretical";
		questions[6] = "A. Candid, straight forward, frank\t\tB. Tactful, kind, encouraging";
		questions[7] = "A. Plan, schedule\t\tB. Unplanned, spontaneous";
		questions[8] = "A. Seek many tasks, public activities, interaction with others\t\tB. Seek private, solitary activities with quiet to concentrate";
		questions[9] = "A. Standard, usual, conventional\t\tB. Different, novel, unique";
		questions[10] = "A. Firm, tend to criticise, hold the line\t\tB. Gentle, tend to appreciate, conciliate";
		questions[11] = "A. Regulated, structured\t\tB. Easygoing, \"live\" and \"let live\"";
		questions[12] = "A. External, communicative, express yourself\t\tB. Internal, reticent, keep to yourself";
		questions[13] = "A. Focus on here-and-now\t\tB. Look to the future, global perspectives, \"big picture\"";
		questions[14] = "A. Tough minded, just\t\tB. tender-hearted, merciful";
		questions[15] = "A. Preparation, plan ahead\t\tB. Go with the flow, adapt as you go";
		questions[16] = "A. Active, initiate\t\tB. Reflective, deliberate";
		questions[17] = "A. Facts, things, \"what is\"\t\tB. Ideas, dreams, \"what could be\", philosophical";
		questions[18] = "A. Matter of fact, issue-orientated\t\tB. Sensitive, people-orientated, compassionate";
		questions[19] = "A. Control, govern\t\tB. Latitude, freedom";

		String response;

		int extrovertedCounter = 0;
		int introvertedCounter = 0;
		int sensingCounter = 0;
		int intuitiveCounter = 0;
		int thinkingCounter = 0;
		int feelingCounter = 0;
		int judgingCounter = 0;
		int perceptiveCounter = 0;

		int currentQuestion = 0;

		char[] responses = new char[20];

		
		while (currentQuestion < 20) {

			System.out.println(questions[currentQuestion]);
			String userInput = input.nextLine();

			if (userInput.equalsIgnoreCase("A") || userInput.equalsIgnoreCase("B")) {
				responses[currentQuestion] = userInput.toUpperCase().charAt(0);
				currentQuestion++;
				
			}

			else {
				System.out.println("Invalid input");
			}

		}

		for (int index = 0; index < 20; index+=4) {
			if (responses[index] == 'A') extrovertedCounter++;
			else introvertedCounter ++;
		}

		for (int index = 1; index < 20; index+=4) {
			if (responses[index] == 'A') sensingCounter ++;
			else intuitiveCounter ++;
		}

		for (int index = 2; index < 20; index+=4) {
			if (responses[index] == 'A') thinkingCounter ++;
			else feelingCounter ++;
		}

		for (int index = 3; index < 20; index+=4) {
			if (responses[index] == 'A') judgingCounter ++;
			else perceptiveCounter ++;
		}

		clear.clearTerminal();

		System.out.println("Hello " + name);
		System.out.printf("""

				Extroverted(A) vs Introverted(B):

				Number of A's selected: %d
				Number of B's Selected: %d
				""", extrovertedCounter, introvertedCounter);

		System.out.printf("""

				Sensing(A) vs Intuitive(B):

				Number of A's selected: %d
				Number of B's Selected: %d
				""", sensingCounter, intuitiveCounter);

		System.out.printf("""

				Thinking(A) vs Feeling(B):

				Number of A's selected: %d
				Number of B's Selected: %d
				""", thinkingCounter, feelingCounter);

		System.out.printf("""

				Judging(A) vs Perceptive(B):

				Number of A's selected: %d
				Number of B's Selected: %d

				""", judgingCounter, perceptiveCounter);

		String mbtiType = "";
		mbtiType += (extrovertedCounter > introvertedCounter) ? "E" : "I";
		mbtiType += (sensingCounter > intuitiveCounter) ? "S" : "N";
		mbtiType += (thinkingCounter > feelingCounter) ? "T" : "F";
		mbtiType += (judgingCounter > perceptiveCounter) ? "J" : "P";

		System.out.println(mbtiType);

		switchcaller.descriptionSwitch(mbtiType);

		System.out.println();

	}

}
			































