import java.util.Scanner;
public class NokiaMenu{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter list of menu functions : ");
	int menu = input.nextInt();

		switch(menu){
		case 1: System.out.println("Phone book");
			System.out.print("phone book options : ");

				switch(phone book){
				case 1:System.out.println("Search");
				break;
				case 2:System.out.println("Service Nos.");
				break;
				case 3:System.out.println("Add name");
				break;
				case 4:System.out.println("Erase");
				break;
				case 5:System.out.println("Edit");
				break;
				case 6:System.out.println("Assign tone");
				break;
				case 7:System.out.println("Send b'card");
				break;
				case 8:System.out.println("Opitions");
					switch(options){
						case 1:System.out.println("Types of view");
						break;
						case 2:System.out.println("Memory status");
						break;
						}
			break;
			case 9:System.out.println("Speed dials");
			break;
			case 10:System.out.println("Voice tags");
			break;
			}
			break;
			case 2: System.out.println("Message");
					switch(message){
						case 1:System.out.println("write mesages");
						break;
						case 2:System.out.println("inbox");
						break;
						case 3:System.out.println("outbox");
						break;
						case 4:System.out.println("Picture messages");
						break;
						case 5:System.out.println("Templates");
						break;
						case 6:System.out.println("Smileys");
						break;
						case 7:System.out.println("Message settings);

							case 1:System.out.println("Set"){

						
								case 1:System.out.println("messages center number");
								break;
								2:System.out.println("messages sent as");
								break;
								case 3:System.out.println("Messages validity");
								break;
								}
								break;
							case 2:System.out.println("Common"){

								case 1:System.out.println("Delivery reports"); 
								break;
								case 2:System.out.println("Reply via same center"); 
								break;
								case 3:System.out.println("Character support"); 
								break;
								}
									break;
								break;
						}
						break;
						case 8: System.out.println("Info service");
						break;
						case 9: System.out.println("voice mailbox number");
						break;
						case 10: System.out.println("services command editor");
						break;
				break;

		case 3: System.out.println("Chat");
		break;
		case 4: System.out.println("Call register");

		case 1:System.out.println("Missed calls");
	break;
	2:System.out.println("Received calls");
	break;
	case 3:System.out.println("Dialled numbers");
	break;
	case 4:System.out.println("Erase recent call lists");
	break;
	case 5:System.out.println("Show call duration");
		case 1:System.out.println("Last call duration");
		break;
		2:System.out.println("All calls' during");
		break;
		case 3:System.out.println("Received calls' duration");
		break;
		case 4:System.out.println("Dialled calls duration");
		break;
		case 5:System.out.println("Clear timers");
		break;

	break;
	case 6:System.out.println("Show call costs");
		case 1:System.out.println("Last call cost"); 
		break;
		case 2:System.out.println("All calls' cost"); 
		break;
		case 3:System.out.println("Clear counters"); 
		break;

	break;
	case 7:System.out.println("Call cost settings");

		case 1:System.out.println("Call cost limit"); 
		break;
		case 2:System.out.println("show costs in"); 
		break;
	break;
	case 8:System.out.println("Prepaid credit");
	break;
					
		break;
		case 5: System.out.println("Tones");
			case 1:System.out.println("Ringing tone");
			break;
			case 2:System.out.println("Ringing volume");
			break;
			case 3:System.out.println("Incoming call alert");
			break;
			case 4:System.out.println("Composer");
			break;
			case 5:System.out.println("Message alert tone");
			break;
			case 6:System.out.println("Keypad tones");
			break;
			case 7:System.out.println("warning and games tones");
			break;
			case 8:System.out.println("Vibrating alert");
			break;
			case 9:System.out.println("Screen saver");
			break;


		break;
		case 6: System.out.println("Settings");

			case 1:System.out.println("Call seetings");
	
	case 1:System.out.println("automatic redial");
	break;
	case 2:System.out.println("speed dialling");
	break;
	case 3:System.out.println("call waiting options");
	break;
	case 4:System.out.println("own number sending");
	break;
	case 5:System.out.println("phone line in use");
	break;
	case 6:System.out.println("Automatic answer");
	break;

break;
case 2:System.out.println("phone setting");
	case 1:System.out.println("language");
	break;
	case 2:System.out.println("cell info display");
	break;
	case 3:System.out.println("welcome note");
	break;
	case 4:System.out.println("Network selection");
	break;
	case 5:System.out.println("lights");
	break;
	case 6:System.out.println("Confirm SIM service actions");
	break;

break;
case 3:System.out.println("Security setting");
	case 1:System.out.println("PIN code request");
	break;
	case 2:System.out.println("call barring service");
	break;
	case 3:System.out.println("fixed dialing");
	break;
	case 4:System.out.println("closed user group");
	break;
	case 5:System.out.println("phone security");
	break;
	case 6:System.out.println("Change access codes");
	break;

break;
case 4:System.out.println("Restore factory setting");
break;



		break;
		case 7: System.out.println("Call divert");
		break;
		case 8: System.out.println("Games");
		break;
		case 9: System.out.println("Calculator");
		break;
		case 10: System.out.println("Reminders");
		break;
		case 11: System.out.println("Clock");
			
	case 1:System.out.println("alarm clock");
	break;
	case 2:System.out.println("clock setting");
	break;
	case 3:System.out.println("date setting");
	break;
	case 4:System.out.println("stopwatch");
	break;
	case 5:System.out.println("counterdown timer");
	break;
	case 6:System.out.println("auto update of date and time");
	break;

		break;
		case 12: System.out.println("Profiles");
		break;
		case 13: System.out.println("SIM Services");
		break;

		





	


}

		
	
		










}}