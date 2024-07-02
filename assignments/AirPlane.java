import java.util.Scanner;
public class AirPlane{
	public static void main (String [] args){
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter speed : ");
	double number1 = input.nextDouble();
	
	System.out.print("Enter acceleration : ");
	double number2 = input.nextDouble();

	double v = number1 * number1;
	double a = number2 + number2;
	double lenght = v / a;
	
	System.out.print(lenght);
	

	}
}