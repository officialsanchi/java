import java.util.Scanner;
public class NumberAndAlphabate{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number : ");
	double number1 = input.nextDouble();
	
	System.out.print("Enter second number : ");
	double number2 = input.nextDouble();

	System.out.print("Enter third number : ");
	double number3 = input.nextDouble();

	

	double sum = number1 + number2 + number3;
	double average = sum /3;
	double product = number1 * number2 * number3;

	
System.out.printf("%d %d %d , sum average product " );
}


	}