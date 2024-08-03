import java.util.Scanner;
public class PhoneKeyPad {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter any Alphabet from A - Z: ");
	char alpha = input.next().charAt();
	
	if(alpha == 'a' && alpha == 'b' && alpha == 'c'){
	System.out.println("2");
	}

		
	if(alpha == 'd' && alpha == 'e' && alpha == 'f' ){
	System.out.println("3");
	}

	if(alpha == 'g' && alpha == 'h' && alpha == 'i'){
	System.out.println("4");
	}

	if(alpha == 'j' && alpha == 'k' && alpha == 'l'){
	System.out.println("5");
	}

	if(alpha == 'm' && alpha == 'n' && alpha == '0'){
	System.out.println("6");
	}

	if(alpha == 'p' && alpha == 'q' && alpha == 'r' && alpha == 's'){
	System.out.println("7");
	}

	if(alpha == 't' && alpha == 'u' && alpha == 'v'){
	System.out.println("8");
	}

	
	if(alpha == 'w' && alpha == 'x' && alpha == 'y' && alpha == 'z'){
	System.out.println("9");
	}

	else{
	System.out.println("invalid character");
	}

}

}





