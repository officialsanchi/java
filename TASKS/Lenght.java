import java.util.Scanner;
public class Lenght{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the speed : ");
	double number1 = input.nextDouble();
	
	System.out.print("Enter acceleration : ");
	double number2 = input.nextDouble();

	double velocity = number1 * number1 ;
	double accelerate = number2 + number2;
	double length = velocity / accele6rate;

	System.out.print(length);
	
	}
}