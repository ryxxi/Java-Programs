import java.util.Scanner;

public class NokiaSwitches {

	private static Scanner input = new Scanner(System.in);
	private NokiaMenus menuCaller = new NokiaMenus();
	private NokiaSwitches switchCaller = new NokiaSwitches();

	public void mainMenuSwitch() {

		System.out.print(menuCaller.mainMenu);
		int menuAnswer = input.nextInt();		

		switch (menuAnswer) {

		case 1:
			System.out.print(menuCaller.phoneBookMenu);
			int phoneBookAnswer = input.nextInt();
			phoneBookSwitch(phoneBookAnswer);
			break;

		case 2:
			System.out.print(menuCaller.messagesMenu);
			int messagesAnswer = input.nextInt();
			messagesSwitch(messagesAnswer);
			break;

		case 3:
			System.out.print(menuCaller.chatMenu);
			break;

		case 4:
			System.out.print(menuCaller.callRegisterMenu);
			int callRegisterAnswer = input.nextInt();
			callRegisterSwitch(callRegisterAnswer);
			break;

		case 5:
			System.out.print(menuCaller.tonesMenu);
			int tonesAnswer = input.nextInt();
			tonesSwitch(tonesAnswer);
			break;

		case 6:
			System.out.print(menuCaller.settingsMenu);
			int settingsAnswer = input.nextInt();
			settingsSwitch(settingsAnswer);
			break;

		case 7:
			System.out.print(menuCaller.callDivertMenu);
			break;

		case 8:
			System.out.print(menuCaller.gamesMenu);
			break;

		case 9:
			System.out.print(menuCaller.gamesMenu);
			break;

		case 10:
			System.out.print(menuCaller.calculatorMenu);
			break;

		case 11:
			System.out.print(menuCaller.clockMenu);
			int clockAnswer = input.nextInt();
			break;

		case 12:
			System.out.print(menuCaller.profilesMenu);
			break;

		case 13:
			System.out.print(menuCaller.simServicesMenu);
			break;

		case 14:
			System.out.print(menuCaller.powerOff);
			break;

		default:
			System.out.print("\n\nInvald input\n\n");
			switchCaller.mainMenuSwitch();
			break;

		}

	}

	public void phoneBookSwitch(int phoneBookAnswer) {

		if (phoneBookAnswer == 11) switchCaller.mainMenuSwitch();

		switch (phoneBookAnswer) {

			case 1: System.out.println("\nSearch\n"); break;
			case 2: System.out.println("\nService Nos.\n"); break;
			case 3: System.out.println("\nAdd name\n"); break;
			case 4: System.out.println("\nErase\n"); break;
			case 5: System.out.println("\nEdit\n"); break;
			case 6: System.out.println("\nAssign tone\n"); break;
			case 7: System.out.println("\nSend b'card\n"); break;
			case 8: System.out.println(menuCaller.optionsMenu);
				int optionsAnswer = input.nextInt();
				optionsSwitch(optionsAnswer);
				break;
			
			case 9: System.out.println("\nSpeed dials\n"); break;
			case 10: System.out.println("\nVoice\n"); break;
			default: System.out.print("\n\nInvalid input\n\n");
				switchCaller.phoneBookSwitch(phoneBookAnswer

		}

	}

	public void optionsSwitch(int optionsAnswer) {

		if (optionsAnswer == 3) switchCaller.phoneBookSwitch(phoneBookAnswer);

		switch (optionsAnswer) {

			case 1: System.out.println("\nType of view\n"); break;
			case 2: System.out.println("\nMemory status\n"); break;
			default: System.out.println("\nInvalid input\n");
				switchCaller.optionsSwitch(optionsAnswer);
				break;

		}

	}

	public void messagesSwitch(int messagesAnswer) {

		if (messagesAnswer == 11) switchCaller.mainMenuSwitch();

		switch (messagesAnswer) {

			case 1: System.out.println("\nWrite messages\n"); break;
			case 2: System.out.println("\nInboc\n"); break;
			case 3: System.out.println("\nOutbox\n"); break;
			case 4: System.out.println("\nPicture messages\n"); break;
			case 5: System.out.println("\nTemplates\n"); break;
			case 6: System.out.println("\nSmileys\n"); break;
			case 7: System.out.println(menuCaller.messageSettingsMenu);
				int messageSettingsAnswer = input.nextInt();
				messageSettingsSwitch(messageSettingsAnswer);
				break;

			case 8: System.out.println("\nInfo service\n"); break;
			case 9: System.out.println("\nVoice mailbox number\n"); break;
			case 10: System.out.println("\nService command editor\n"); break;
			default: System.out.println("\nInvalid input\n");
				switchCaller.messagesSwitch(messagesAnswer);
				break;

		}

	}

	public void messageSettingsSwitch(int messageSettingsAnswer) {

		if (messageSettingsAnswer == 3) switchCaller.messagesSwitch(messagesAnswer);

		switch (messageSettingsAnswer) {

			case 1: System.out.print(menuCaller.setOneMenu);
				int setOneAnswer = input.nextInt();
				setOneSwitch(setOneAnswer);
				break;

			case 2: System.out.print(menuCaller.commonMenu);
				int commonAnswer = input.nextInt();
				commonSwitch(commonAnswer);
				break;
			default: System.out.print("\n\nInvalid input\n\n");
					switchCaller.messageSettingsSwitch(messageSettingsAnswers);
					break;

		}

	}

	public void setOneSwitch(int setOneAnswer) {

		if (setOneAnswer == 4) switchCaller.messageSettingsSwitch(messageSettingsAnswer);

		switch (setOneAnswer) {

			case 1: System.out.println("\nMessage centre number\n"); break;
			case 2: System.out.println("\nMessages sent as\n"); break; 
			case 3: System.out.println("\nMessage validity\n"); break; 
			default: System.out.println("\nInvalid input\n");
				switchCaller.setOneSwitch(setOneAnswer);
				break;

		}

	}

	public void commonSwitch(int commonAnswer) {

		if (commonAnswer == 4) switchCaller.messageSettingsSwitch(messageSettingsAnswer);

		switch (commonAnswer) {

			case 1: System.out.println("\nDelivery reports\n"); break;
			case 2: System.out.println("\nReply via same centre\n"); break; 
			case 3: System.out.println("\nCharacter support\n"); break; 
			default: System.out.println("\nInvalid input\n");
				switchCaller.commonSwitch(commonAnswer);
				break;

		}

	}

	public void callRegisterSwitch(int callRegisterAnswer) {

		if (callRegisterAnswer == 9) switchCaller.mainMenuSwitch();

		switch (callRegisterAnswer) { 

			case 1: System.out.println("\nMissed calls\n"); break;
			case 2: System.out.println("\nReceived calls\n"); break;
			case 3: System.out.println("\nDialled numbers\n"); break;
			case 4: System.out.println("\nErase recent call lists\n"); break;
			case 5: System.out.print(menuCaller.showCallDurationMenu);
				int showCallDurationAnswer = input.nextInt();
				showCallDurationSwitch(showCallDurationAnswer);
				break;

			case 6: System.out.print(menuCaller.showCallCostsMenu);
				int showCallCostsAnswer = input.nextInt();
				showCallCostsSwitch(showCallCostsAnswer);
				break;

			case 7: System.out.print(menuCaller.callCostSettingsMenu);
				int callCostSettingsAnswer = input.nextInt();
				callCostSettingsSwitch(callCostSettingsAnswer);
				break;

			case 8: System.out.println("\nPrepaid credit\n"); break;

		}

	}

	public void showCallDurationSwitch(int showCallDurationAnswer) {

		if (showCallDurationAnswer == 6
}
































