import java.util.Scanner;
public class Do{
	public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int number1 = input.nextInt();

	System.out.print ("Enter second number : ");
	int number2 = input.nextInt();

	int numberTripled = number1 *3;
	int numberDoubled = number2 *2;

	if ( numberTripled == numberDoubled){
		System.out.print("equal");
	}

	else {
	System.out.print("not equal");
}
	}
}
	