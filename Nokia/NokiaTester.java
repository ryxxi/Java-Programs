import java.util.Scanner;

public class NokiaSwitches {

	private static Scanner input = new Scanner(System.in);
	private NokiaMenus menuCaller = new NokiaMenus();
	private int phoneBookAnswer;
	private int messagesAnswer;
	private int messageSettingsAnswer;
	private int callRegisterAnswer;
	private int settingsAnswer;
	private int tonesAnswer;
	private int clockAnswer;

	public void mainMenuSwitch(int menuAnswer) {

	phoneBookAnswer = 0;
	messagesAnswer = 0;
	messageSettingsAnswer = 0;
	callRegisterAnswer = 0;
	settingsAnswer = 0;
	tonesAnswer = 0;
	clockAnswer = 0;
		

		System.out.print(menuCaller.mainMenu);
		int menuAnswer = input.nextInt();		

		switch (menuAnswer) {

		case 1:
			System.out.print(menuCaller.phoneBookMenu);
			phoneBookAnswer = input.nextInt();
			phoneBookSwitch(phoneBookAnswer);
			break;

		case 2:
			System.out.print(menuCaller.messagesMenu);
			messagesAnswer = input.nextInt();
			messagesSwitch(messagesAnswer);
			break;

		case 3:
			System.out.print(menuCaller.chatMenu);
			break;

		case 4:
			System.out.print(menuCaller.callRegisterMenu);
			callRegisterAnswer = input.nextInt();
			callRegisterSwitch(callRegisterAnswer);
			break;

		case 5:
			System.out.print(menuCaller.tonesMenu);
			tonesAnswer = input.nextInt();
			tonesSwitch(tonesAnswer);
			break;

		case 6:
			System.out.print(menuCaller.settingsMenu);
			settingsAnswer = input.nextInt();
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
			clockAnswer = input.nextInt();
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
			System.out.print("\nInvalid input\n"); break;

		}

	}

	public void phoneBookSwitch(int phoneBookAnswer) {

		if (phoneBookAnswer == 11) {
		mainMenuSwitch();
		return;
		}
		else {

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
			default: System.out.print("\nInvalid input\n"); break;

		}

		}

	}

	public void optionsSwitch(int optionsAnswer) {

		if (optionsAnswer == 3) {
		mainMenuSwitch(1);
		return;
		}
		else {

		switch (optionsAnswer) {

			case 1: System.out.println("\nType of view\n"); break;
			case 2: System.out.println("\nMemory status\n"); break;
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void messagesSwitch(int messagesAnswer) {

		if (messagesAnswer == 11) {
		mainMenuSwitch();
		return;
		}
		else {

		switch (messagesAnswer) {

			case 1: System.out.println("\nWrite messages\n"); break;
			case 2: System.out.println("\nInbox\n"); break;
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
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void messageSettingsSwitch(int messageSettingsAnswer) {

		if (messageSettingsAnswer == 3) {
		messagesSwitch(messagesAnswer);
		return;
		}
		else {

		switch (messageSettingsAnswer) {

			case 1: System.out.print(menuCaller.setOneMenu);
				int setOneAnswer = input.nextInt();
				setOneSwitch(setOneAnswer);
				break;

			case 2: System.out.print(menuCaller.commonMenu);
				int commonAnswer = input.nextInt();
				commonSwitch(commonAnswer);
				break;
			default: System.out.print("\nInvalid input\n"); break;

		}

		}

	}

	public void setOneSwitch(int setOneAnswer) {

		if (setOneAnswer == 4) {
		messageSettingsSwitch(messageSettingsAnswer);
		return;
		}
		else {

		switch (setOneAnswer) {

			case 1: System.out.println("\nMessage centre number\n"); break;
			case 2: System.out.println("\nMessages sent as\n"); break; 
			case 3: System.out.println("\nMessage validity\n"); break; 
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void commonSwitch(int commonAnswer) {

		if (commonAnswer == 4) {
		messageSettingsSwitch(messageSettingsAnswer);
		return;
		}
		else {

		switch (commonAnswer) {

			case 1: System.out.println("\nDelivery reports\n"); break;
			case 2: System.out.println("\nReply via same centre\n"); break; 
			case 3: System.out.println("\nCharacter support\n"); break; 
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void callRegisterSwitch(int callRegisterAnswer) {

		if (callRegisterAnswer == 9) {
		mainMenuSwitch();
		return;
		}
		else {

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
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void showCallDurationSwitch(int showCallDurationAnswer) {

		if (showCallDurationAnswer == 6) {
		callRegisterSwitch(callRegisterAnswer);
		return;
		}
		else {

		switch (showCallDurationAnswer) {

			case 1: System.out.print("\nLast call duration\n"); break;
			case 2: System.out.print("\nAll calls' duration\n"); break;
			case 3: System.out.print("\nReceived call's duration\n"); break;
			case 4: System.out.print("\nDialled calls' duration\n"); break;
			case 5: System.out.print("\nTimers cleared\n"); break;
			default: System.out.print("\nInvalid input\n"); break;

		}

		}

	}

	public void showCallCostsSwitch(int showCallCostsAnswer) {

		if (showCallCostsAnswer == 4) {
		callRegisterSwitch(callRegisterAnswer);
		return;
		}
		else {

		switch (showCallCostsAnswer) {

			case 1: System.out.print("\nLast call cost\n"); break;
			case 2: System.out.print("\nAll calls' cost\n"); break;
			case 3: System.out.print("\nCounters cleared\n"); break;
			default: System.out.print("\nInvalid input\n"); break;

		}

		}

	}

	public void callCostSettingsSwitch(int callCostSettingsAnswer) {

		if (callCostSettingsAnswer == 3) {
		callRegisterSwitch(callRegisterAnswer);
		return;
		}
		else {

		switch (callCostSettingsAnswer) {

			case 1: System.out.print("\nCall cost settings\n"); break;
			case 2: System.out.print("\nShow costs in\n"); break;
			default: System.out.print("\nInvalid input\n"); break;

		}

		}

	}

	public void tonesSwitch(int tonesAnswer) {

		if (tonesAnswer == 10) {
		mainMenuSwitch();
		return;
		}
		else {

		switch (tonesAnswer) {

			case 1: System.out.println("\nRinging tone\n"); break;
			case 2: System.out.println("\nRinging volume\n"); break;
			case 3: System.out.println("\nIncoming call alert\n"); break;
			case 4: System.out.println("\nComposer\n"); break;
			case 5: System.out.println("\nMessage alert tone\n"); break;
			case 6: System.out.println("\nKeypad tones\n"); break;
			case 7: System.out.println("\nWarning and game tone\n"); break;
			case 8: System.out.println("\nVibrating alert\n"); break;
			case 9: System.out.println("\nScreen saver\n"); break;
			default: System.out.print("\nInvalid input\n"); break;

		}

		}

	}

	public void settingsSwitch(int settingsAnswer) {

		if (settingsAnswer == 5) {
		this.mainMenuSwitch();
		return;
		}
		else {

		switch (settingsAnswer) {

			case 1: System.out.println(menuCaller.callSettingsMenu);
				int callSettingsAnswer = input.nextInt();
				callSettingsSwitch(callSettingsAnswer);
				break;

			case 2: System.out.print(menuCaller.phoneSettingsMenu);
				int phoneSettingsAnswer = input.nextInt();
				phoneSettingsSwitch(phoneSettingsAnswer);
				break;

			case 3: System.out.println(menuCaller.securitySettingsMenu);
				int securitySettingsAnswer = input.nextInt();
				securitySettingsSwitch(securitySettingsAnswer);
				break;

			case 4: System.out.println("\nRestore factory settings\n"); break;
			default: System.out.print("\nInvalid input\n"); break;

		}

		}

	}

	public void callSettingsSwitch(int callSettingsAnswer) {

		if (callSettingsAnswer == 7) {
		settingsSwitch(settingsAnswer);
		return;
		}
		else {

		switch (callSettingsAnswer) {

			case 1: System.out.println("\nAutomatic redial\n"); break;
			case 2: System.out.println("\nSpeed dialling\n"); break;
			case 3: System.out.println("\nCall waiting options\n"); break;
			case 4: System.out.println("\nOwn number sending\n"); break;
			case 5: System.out.println("\nPhone line in use\n"); break;
			case 6: System.out.println("\nAutomatic answer\n"); break;
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void phoneSettingsSwitch(int phoneSettingsAnswer) {

		if (phoneSettingsAnswer == 7) {
		settingsSwitch(settingsAnswer);
		return;
		}
		else {

		switch (phoneSettingsAnswer) {

			case 1: System.out.println("\nLanguage\n"); break;
			case 2: System.out.println("\nCell info display\n"); break;
			case 3: System.out.println("\nWelcome note\n"); break;
			case 4: System.out.println("\nNetwork selection\n"); break;
			case 5: System.out.println("\nLights\n"); break;
			case 6: System.out.println("\nConfirm SIM service actions\n"); break;
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void securitySettingsSwitch(int securitySettingsAnswer) {

		if (securitySettingsAnswer == 7) {
		settingsSwitch(settingsAnswer);
		return;
		}
		else {

		switch (securitySettingsAnswer) {

			case 1: System.out.println("\nPIN code request\n"); break;
			case 2: System.out.println("\nCall barring service\n"); break;
			case 3: System.out.println("\nFixed dialling\n"); break;
			case 4: System.out.println("\nClosed user group\n"); break;
			case 5: System.out.println("\nPhone security\n"); break;
			case 6: System.out.println("\nChange access codes\n"); break;
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

	public void clockSwitch(int clockAnswer) {

		if (clockAnswer == 7) {
		mainMenuSwitch();
		return;
		}
		else {

		switch (clockAnswer) {

			case 1: System.out.println("\nAlarm clock\n"); break;
			case 2: System.out.println("\nClock settings\n"); break;
			case 3: System.out.println("\nDate setting\n"); break;
			case 4: System.out.println("\nStopwatch\n"); break;
			case 5: System.out.println("\nCountdown timer\n"); break;
			case 6: System.out.println("\nAuto update of date and time\n"); break;
			default: System.out.println("\nInvalid input\n"); break;

		}

		}

	}

}
































