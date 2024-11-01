import java.util.Scanner;

public class Nokia {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		NokiaMenus menuCaller = new NokiaMenus();

		System.out.print(menuCaller.mainMenu);
		int menuAnswer = input.nextInt();
		
		switch (menuAnswer) {

		case 1:
			System.out.print(menuCaller.phoneBookMenu);
			int phoneBookAnswer = input.nextInt();

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

				switch (optionsAnswer) {

				case 1: System.out.println("\nType of view\n"); break;
				case 2: System.out.println("\nMemory status\n"); break;
				default: System.out.println("\nInvalid input\n"); break;

				} break;
			
			case 9: System.out.println("\nSpeed dials\n"); break;
			case 10: System.out.println("\nVoice\n"); break;

			} break;

		case 2:
			System.out.print(menuCaller.messagesMenu);
			int messagesAnswer = input.nextInt();

			switch (messagesAnswer) {

			case 1: System.out.println("\nWrite messages\n"); break;
			case 2: System.out.println("\nInboc\n"); break;
			case 3: System.out.println("\nOutbox\n"); break;
			case 4: System.out.println("\nPicture messages\n"); break;
			case 5: System.out.println("\nTemplates\n"); break;
			case 6: System.out.println("\nSmileys\n"); break;
			case 7: System.out.println(menuCaller.messageSettingsMenu);
				int messageSettingsAnswer = input.nextInt();

				switch (messageSettingsAnswer) {

				case 1: System.out.print(menuCaller.setOneMenu);
					int setOneAnswer = input.nextInt();

					switch (setOneAnswer) {

					case 1: System.out.println("\nMessage centre number\n"); break;
					case 2: System.out.println("\nMessages sent as\n"); break; 
					case 3: System.out.println("\nMessage validity\n"); break; 
					default: System.out.println("\nInvalid input\n"); break;

					} break;


				case 2: System.out.print(menuCaller.commonMenu);
					int commonAnswer = input.nextInt();

					switch (commonAnswer) {

					case 1: System.out.println("\nDelivery reports\n"); break;
					case 2: System.out.println("\nReply via same centre\n"); break; 
					case 3: System.out.println("\nCharacter support\n"); break; 
					default: System.out.println("\nInvalid input\n"); break;

					} break;

				} break;

			case 8: System.out.println("\nInfo service\n"); break;
			case 9: System.out.println("\nVoice mailbox number\n"); break;
			case 10: System.out.println("\nService command editor\n"); break;

			} break;

		case 3:
			System.out.println(menuCaller.chatMenu);

		break;

		case 4:
			System.out.print(menuCaller.callRegisterMenu);
			int callRegisterAnswer = input.nextInt();

			switch (callRegisterAnswer) { 

			case 1: System.out.println("\nMissed calls\n"); break;
			case 2: System.out.println("\nReceived calls\n"); break;
			case 3: System.out.println("\nDialled numbers\n"); break;
			case 4: System.out.println("\nErase recent call lists\n"); break;
			case 5: System.out.print(menuCaller.showCallDurationMenu);
				int showCallDurationAnswer = input.nextInt();

				switch (showCallDurationAnswer) {

				case 1: System.out.print("\nLast call duration\n"); break;
				case 2: System.out.print("\nAll calls' duration\n"); break;
				case 3: System.out.print("\nReceived call's duration\n"); break;
				case 4: System.out.print("\nDialled calls' duration\n"); break;
				case 5: System.out.print("\nTimers cleared\n"); break;
				default: System.out.print("\nInvalid input\n"); break;

				} break;

			case 6: System.out.print(menuCaller.showCallCostsMenu);
				int showCallCostsAnswer = input.nextInt();

				switch (showCallCostsAnswer) {

				case 1: System.out.print("\nLast call cost\n"); break;
				case 2: System.out.print("\nAll calls' cost\n"); break;
				case 3: System.out.print("\nCounters cleared\n"); break;
				default: System.out.print("\nInvalid input\n"); break;

				} break;

			case 7: System.out.print(menuCaller.callCostSettingsMenu);
				int callCostSettingsAnswer = input.nextInt();

				switch (callCostSettingsAnswer) {

				case 1: System.out.print("\nCall cost settings\n"); break;
				case 2: System.out.print("\nShow costs in\n"); break;
				default: System.out.print("\nInvalid input\n"); break;

				} break;

			case 8: System.out.println("\nPrepaid credit\n"); break;

			}

		break;

		case 5:
			System.out.print(menuCaller.tonesMenu);
			int tonesAnswer = input.nextInt();

			switch (tonesAnswer) {

			case 1: System.out.println("\nRinging tone\n"); break;
			case 2: System.out.println("\nRinging volume\n"); break;
			case 3: System.out.println("\nIncoming call alert\n"); break;
			case 4: System.out.println("\nComposer\n"); break;
			case 5: System.out.println("\nMessage alerttone\n"); break;
			case 6: System.out.println("\nKeypad tones\n"); break;
			case 7: System.out.println("\nWarning and game tone\n"); break;
			case 8: System.out.println("\nRingin\n"); break;
			case 9: System.out.println("\nRinging tone\n"); break;

			}

		break;

		case 6:
			System.out.print(menuCaller.settingsMenu);
			int settingsAnswer = input.nextInt();

			switch (settingsAnswer) {

			case 1: System.out.println(menuCaller.callSettingsMenu);
				int callSettingsAnswer = input.nextInt();

				switch (callSettingsAnswer) {

				case 1: System.out.println("\nAutomatic redial\n"); break;
				case 2: System.out.println("\nSpeed dialling\n"); break;
				case 3: System.out.println("\nCall waiting options\n"); break;
				case 4: System.out.println("\nOwn number sending\n"); break;
				case 5: System.out.println("\nPhone line in use\n"); break;
				case 6: System.out.println("\nAutomatic answer\n"); break;
				default: System.out.println("\nInvalid input\n"); break;

				} break;

			case 2: System.out.print(menuCaller.phoneSettingsMenu);
				int phoneSettingsAnswer = input.nextInt();

				switch (phoneSettingsAnswer) {

				case 1: System.out.println("\nLanguage\n"); break;
				case 2: System.out.println("\nCell info display\n"); break;
				case 3: System.out.println("\nWelcome note\n"); break;
				case 4: System.out.println("\nNetwork selection\n"); break;
				case 5: System.out.println("\nLights\n"); break;
				case 6: System.out.println("\nConfirm SIM service actions\n"); break;
				default: System.out.println("\nInvalid input\n"); break;

				} break;

			case 3: System.out.println(menuCaller.securitySettingsMenu);
				int securitySettingsAnswer = input.nextInt();

				switch (securitySettingsAnswer) {

				case 1: System.out.println("\nPIN code request\n"); break;
				case 2: System.out.println("\nCall barring service\n"); break;
				case 3: System.out.println("\nFixed dialling\n"); break;
				case 4: System.out.println("\nClosed user group\n"); break;
				case 5: System.out.println("\nPhone security\n"); break;
				case 6: System.out.println("\nChange access codes\n"); break;
				default: System.out.println("\nInvalid input\n"); break;

				} break;

			case 4: System.out.println("\nRestore factory settings\n"); break;
			default: System.out.print("\nInvalid input\n"); break;

			} 

		break;

		case 7:
			System.out.println(menuCaller.callDivertMenu);
		break;

		case 8:
			System.out.println(menuCaller.gamesMenu);
		break;

		case 9:
			System.out.println(menuCaller.calculatorMenu);
		break;

		case 10:
			System.out.println("menuCaller.remindersMenu");
		break;
			
		case 11:
			System.out.print(menuCaller.clockMenu);
			int clockAnswer = input.nextInt();

			switch (clockAnswer) {

			case 1: System.out.println("\nAlarm clock\n"); break;
			case 2: System.out.println("\nClock settings\n"); break;
			case 3: System.out.println("\nDate setting\n"); break;
			case 4: System.out.println("\nStopwatch\n"); break;
			case 5: System.out.println("\nCountdown timer\n"); break;
			case 6: System.out.println("\nAuto update of date and time\n"); break;
			default: System.out.println("\nInvalid input\n"); break;

			}


		break;

		case 12:
			System.out.println(menuCaller.profilesMenu);
		break;

		case 13:
			System.out.println(menuCaller.simServicesMenu);
		break;

		case 14:
			System.out.println(menuCaller.powerOff);
		break;

		default:
			System.out.println("\nInvalid input\n");
		break;

		


		}

	}

}










































