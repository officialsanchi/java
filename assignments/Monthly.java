import java.util.Scanner;
public class Monthly{
	public static void main (String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance : ");
	double number1 = input.nextDouble();

	System.out.print("Enter interest : ");
	double number2 = input.nextDouble(); 

	 double rate = number2 / 1200;
	 double annualInterest = number1 * rate;
	
	System.out.print(annualInterest);
	}
}