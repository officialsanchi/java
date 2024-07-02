import java.util.Scanner;
public class Grade{
	public static void main(String [] args){
	Scanner chidinma = new Scanner(System.in);
	
		for ( int count; count < 5; count ++){
	
		System.out.print("Enter alphabeth for A - D & F : ");
	
		String alph = chidinma . next String();
		if ( alph == A){
		System.out.print("4");
		}
		else if (alph == B){
		System.out.print("3");
		}
		else if (alph == C){
		System.out.print("2");
		}
		else if (alph == D){
		System.out.print("1");
		}
		else if (alph == F){
		System.out.print("0");
		}

	}
}