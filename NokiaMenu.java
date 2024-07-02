import java.util.Scanner;
public class NokiaMenu{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("HELLO WELCOME!!! : ");
	System.out.println("""
			LIST OF MENU FUNCTIONS
	
			1.Phone Book
			2.Message
			3.Chat
			4.Call Register
			5.Tones
			6.Settings
			7.Call Divert
			8.Games
			9.Calculator
			10.Reminders
			11.Clock
			12.Profiles
			13.SIM Services

	 """);
		int menu = input.nextInt();
		switch(menu){
		case 1 :System.out.println("""
	

	1.Search
	2.Service Nos.
	3.Add name
	4.Erase
	5.Edit
	6.Assign tone
	7.Send b'card
	8.Opitions
	9.Speed dials
	10.Voice tags

""");

	int phoneBook = input.nextInt();
	switch(phoneBook){
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
				case 8:System.out.println("""

				list of options 
				
				1.Types of view
				2.Memory status
""");
				int options = input.nextInt();
				switch (options){
						case 1:System.out.println("Types of view");
						break;
						case 2:System.out.println("Memory status");
						break;
						default : System.out.println("Wrong options selection");
}
				break;
				case 9:System.out.println("Speed dials");
				break;
				case 10:System.out.println("Voice tags");
				break;
				default : System.out.println("wrong phonebook selection");

}


		break;
		case 2: System.out.println("""
		list of messages
		
		1.write message
		2.inbox
		3.outbox
		4.picture meessages
		5.templates
		6.smileys
		7.messages settings
		8.info service
		9.voice mailbox number
		10.service command editor


""");

				int message = input.nextInt();
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
						case 7:System.out.println("""
						list of message settings

	       1.set 1
	        2.common
 """);							
						int Setting = input.nextInt();
						switch( Setting){
						case 1:System.out.println("""
							list of set
							

						1.message center number
						2.message sent as
						3.message validity

					""");
	
						int set = input.nextInt();
						switch(set){
						case 1:System.out.println("messages center number");
						break;
						case 2:System.out.println("messages sent as");
						break;
						case 3:System.out.println("Messages validity");
						break;
						default : System.out.println("Wrong  setting set selection");


						}
						break;
						case 2:System.out.println("""
						
						list of common
						
						1. delivery reports
						2. reply via same center
						3. character support
					

					""");

						int common = input.nextInt();
						switch(common){
						case 1:System.out.println("Delivery reports"); 
						break;
						case 2:System.out.println("Reply via same center"); 
						break;
						case 3:System.out.println("Character support"); 
						break;
						default :System.out.println("wrong common seetings seletions");

						}
						break;
						default : System.out.println("wrong message setting selection");

					}


						
						break;
						case 8: System.out.println("Info service");
						break;
						case 9: System.out.println("voice mailbox number");
						break;
						case 10: System.out.println("services command editor");
						break;
	
}
		
		break;
		case 3: System.out.println("Chat");
		break;
		case 4: System.out.println("""
		call register
	
		1.missed calls
		2.recieved calls
		3.dialled numbers
		4.erase recent call lists
		5.show call during
		6.show call costs
		7.call cost setting
		8.prepaid credit

         """);

		int register = input.nextInt();
		switch(register){
		case 1:System.out.println("Missed calls");
		break;
		case 2:System.out.println("Received calls");
		break;
		case 3:System.out.println("Dialled numbers");
		break;
		case 4:System.out.println("Erase recent call lists");
		break;
		case 5:System.out.println("""
		Show call duration

		1.last call duration
		2.all calls' duration
		3.received calls duration
		4.dialled calls' duration
		5.clear timers

	""");
		int duration = input.nextInt();
		switch(duration){
			case 1:System.out.println("Last call duration");
			break;
			case 2:System.out.println("All calls' during");
			break;
			case 3:System.out.println("Received calls' duration");
			break;
			case 4:System.out.println("Dialled calls duration");
			break;
			case 5:System.out.println("Clear timers");

			break;
			default : System.out.println("wrong show call duration");

}
		break;
		case 6:System.out.println("""
		
		call show costs
		
		
		1.last call cost
		2.all calls cost
		3.clear counters
	""");
		int showcost = input.nextInt();
		switch (showcost){
		case 1:System.out.println("Last call cost"); 
		break;
		case 2:System.out.println("All calls' cost"); 
		break;
		case 3:System.out.println("Clear counters"); 
		break;
		default : System.out.println("wrong call show costs selection");
		}
		break;
		case 7:System.out.println("""
		Call cost settings

		1.call cost limit
		2.show costs in
""");
		int callcost = input.nextInt();
		switch(callcost){
		case 1:System.out.println("Call cost limit"); 
		break;
		case 2:System.out.println("show costs in"); 
		break;
		default : System.out.println("wrong call cost setting selection");

		}

		break;
		default : System.out.println("wrong call register selection");

		}
		break;
		case 5: System.out.println("""
		
		Tones
		
		1.ringing tone
		2.rining volume
		3.incoming call alert
		4.composer
		5.message alert
		6.keypad
		7.warning and game tones
		8.vibrating alert
		9.screen saver
	""");
		int tones = input.nextInt();
		switch(tones){
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
			default: System.out.println("Wrong tone selection");

}

		break;
		case 6: System.out.println("""

		Settings
		
		1.call settings
		2.phone settings
		3.security settings
		4.restore factory settings
	""");
		int settings = input.nextInt();
		switch(settings){
		case 1: System.out.println("""
		Call settings
		1.automatic redial
		2.speed dialling
		3.call waiting options
		4.own number sending
		5.phone line in use
		6.Automatic answer

		
	""");
		int callsettings = input.nextInt();
		switch(callsettings){
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
			default : System.out.println("wrong call setting selection");

		}
		case 2: System.out.println("""
		phone settings
		1.language
		2.cell info display
		3.welcome note
		4.Network selection
		5.lights
		6.Confirm SIM service actions
	""");

		int phonesettings = input.nextInt();
		switch(phonesettings){
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
		default : System.out.println("wrong phone setting selection");
		}
		case 3: System.out.println("""
		security settings

		1.PIN code request
		2.call barring service
		3.fixed dialing
		4.closed user group
		5.phone security
		6.Change access codes

	
		""");
		int securitysettings = input.nextInt();
		switch(securitysettings){
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


}
		case 4: System.out.println("restore factory settings");

		}
		break;
		case 7: System.out.println("Call divert");
		break;
		case 8: System.out.println("Games");
		break;
		case 9: System.out.println("Calculator");
		break;
		case 10: System.out.println("Reminders");
		break;
		case 11: System.out.println("""
		Clock

		1.alarm clock
		2.clock setting
		3.date setting
		4.stopwatch
		5.counterdown timer
		6.auto update of date and time


	""");
		int clock = input.nextInt();
		switch(clock){
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
		default : System.out.println("wrong clock selection");

		
}
		break;
		case 12: System.out.println("Profiles");
		break;
		case 13: System.out.println("SIM Services");
		break;
		
		default : System.out.println("Wrong menu selection");


	}


}




}