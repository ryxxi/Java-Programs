import java.util.Scanner;

public class NokiaTester {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		NokiaMenus menuCaller = new NokiaMenus();

		System.out.print(menuCaller.mainMenu);
		int menuAnswer = input.nextInt();
		
		switch (menuAnswer) {

		case 1:
			System.out.print("""

					Phonebook

					Select:

					1.  Search
					2.  Service Nos.
					3.  Add name
					4.  Erase
					5.  Edit
					6.  Assign tone
					7.  Send b'card
					8.  Options
					9.  Speed dials
					10. Voice
					11. Return
					12. Power Off

					""");
					int phoneBookAnswer = input.nextInt();

			switch (phoneBookAnswer) {

			case 1: System.out.println("\nSearch\n"); break;
			case 2: System.out.println("\nService Nos.\n"); break;
			case 3: System.out.println("\nAdd name\n"); break;
			case 4: System.out.println("\nErase\n"); break;
			case 5: System.out.println("\nEdit\n"); break;
			case 6: System.out.println("\nAssign tone\n"); break;
			case 7: System.out.println("\nSend b'card\n"); break;
			case 8: System.out.println("""
						
						Options

						Select:

						1. Type of view
						2. Memory Status
						3. Return
						4. Power Off

						""");
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
			System.out.print("""

					Messages

					Select:

					1.  Write messages
					2.  Inbox
					3.  Outbox
					4.  Picture messages
					5.  Templates
					6.  Smileys
					7.  Message settings
					8.  Info service
					9.  Voice mailbox number
					10. Service command editor
					11. Return
					12. Power Off

					""");
					int messagesAnswer = input.nextInt();

			switch (messagesAnswer) {

			case 1: System.out.println("\nWrite messages\n"); break;
			case 2: System.out.println("\nInboc\n"); break;
			case 3: System.out.println("\nOutbox\n"); break;
			case 4: System.out.println("\nPicture messages\n"); break;
			case 5: System.out.println("\nTemplates\n"); break;
			case 6: System.out.println("\nSmileys\n"); break;
			case 7: System.out.println("""

						Message settings

						Select:

						1. Set 1
						2. Common
						3. Return
						4. Power Off

						""");
						int messageSettingsAnswer = input.nextInt();

				switch (messageSettingsAnswer) {

				case 1: System.out.print("""

							Set 1

							Select:

							1. Message centre number
							2. Messages sent as
							3. Message validity
							4. Return
							5. Power Off

							""");
							int setOneAnswer = input.nextInt();

					switch (setOneAnswer) {

					case 1: System.out.println("\nMessage centre number\n"); break;
					case 2: System.out.println("\nMessages sent as\n"); break; 
					case 3: System.out.println("\nMessage validity\n"); break; 
					default: System.out.println("\nInvalid input\n"); break;

					} break;


				case 2: System.out.print("""

							Common

							Select:

							1. Delivery reports
							2. Reply via same centre
							3. Character support
							4. Return
							5. Power Off

							""");
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
			System.out.println("\nChat\n");

		break;

		case 4:
			System.out.print("""

					Call register

					Select:

					1.  Missed calls
					2.  Received calls
					3.  Dialled numbers
					4.  Erase recent call lists
					5.  Show call duration
					6.  Show call costs
					7.  Call cost settings
					8.  Prepaid credit
					9.  Return
					10. Power Off

					""");
					int callRegisterAnswer = input.nextInt();

			switch (callRegisterAnswer) { 

			case 1: System.out.println("\nMissed calls\n"); break;
			case 2: System.out.println("\nReceived calls\n"); break;
			case 3: System.out.println("\nDialled numbers\n"); break;
			case 4: System.out.println("\nErase recent call lists\n"); break;
			case 5: System.out.print("""

						Show call duration

						Select:

						1. Last call duration
						2. All calls' duration
						3. Received call's duration
						4. Dialled calls' duration
						5. Clear timers
						6. Return
						7. Power Off

						""");
						int showCallDurationAnswer = input.nextInt();

				switch (showCallDurationAnswer) {

				case 1: System.out.print("\nLast call duration\n"); break;
				case 2: System.out.print("\nAll calls' duration\n"); break;
				case 3: System.out.print("\nReceived call's duration\n"); break;
				case 4: System.out.print("\nDialled calls' duration\n"); break;
				case 5: System.out.print("\nTimers cleared\n"); break;
				default: System.out.print("\nInvalid input\n"); break;

				} break;

			case 6: System.out.print("""

						Show call costs

						Select:

						1. Last call cost
						2. All calls' cost
						3. Clear counters
						4. Return
						5. Power Off

						""");
						int showCallCostsAnswer = input.nextInt();

				switch (showCallCostsAnswer) {

				case 1: System.out.print("\nLast call cost\n"); break;
				case 2: System.out.print("\nAll calls' cost\n"); break;
				case 3: System.out.print("\nCounters cleared\n"); break;
				default: System.out.print("\nInvalid input\n"); break;

				} break;

			case 7: System.out.print("""

						Call cost settings

						Select:

						1. Call cost settings
						2. Show costs in
						3. Return
						4. Power Off


						""");
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
			System.out.print("""

					Tones

					Select:

					1.  Ringing tone
					2.  Ringing volume
					3.  Incoming call alert
					4.  Composer
					5.  Message alert tone
					6.  Keypad tones
					7.  Warning and game tones
					8.  Vibrating alert
					9.  Screen saver
					10. Return
					11. Power Off

					""");
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
			System.out.print("""

					Settings

					Select:

					1. Call settings
					2. Phone settings
					3. Security settings
					4. Restore factory settings

					""");
					int settingsAnswer = input.nextInt();

			switch (settingsAnswer) {

			case 1: System.out.println("""

						Call settings

						Select:

						1. Automatic redial
						2. Speed dialling
						3. Call waiting options
						4. Own number sending
						5. Phone line in use
						6. Automatic answer
						7. Return
						8. Power Off

						""");

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

			case 2: System.out.print("""

						Phone settings

						Select:

						1. Language
						2. Cell info display
						3. Welcome note
						4. Network selection
						5. Lights
						6. Confirm SIM service actions
						7. Return
						8. Power Off

						""");
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

			case 3: System.out.println("""

						Security settings

						Select:

						1. PIN code request
						2. Call barring service
						3. Fixed dialling
						4. Closed user group
						5. Phone security
						6. Change access codes
						7. Return
						8. Power Off

						""");
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
			System.out.println("\nCall divert\n");
		break;

		case 8:
			System.out.println("\nGames\n");
		break;

		case 9:
			System.out.println("\nCalculator\n");
		break;

		case 10:
			System.out.println("\nReminders\n");
		break;
			
		case 11:
			System.out.print("""

					Clock

					Select:

					1. Alarm clock
					2. Clock settings
					3. Date setting
					4. Stopwatch
					5. Countdown timer
					6. Auto update of date and time
					7. Return
					8. Power Off

					""");
					int securitySettingsAnswer = input.nextInt();

			switch (securitySettingsAnswer) {

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
			System.out.println("\nProfiles\n");
		break;

		case 13:
			System.out.println("\nSIM services\n");
		break;

		case 14:
			System.out.println("\nPower Off\n");
		break;

		default:
			System.out.println("\nInvalid input\n");
		break;

		


		}

	}

}










































