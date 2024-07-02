import java.util.Scanner;
public class Acceleration{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number : ");
	double number1 = input.nextDouble();
	
	System.out.print("Enter second number : ");
	double number2 = input.nextDouble();
	
	System.out.print("Enter third number : ");
	double number3 = input.nextDouble();


	double num = number2 - number1;
	double num1 = num / number3;
	
	System.out.print(num1);



	}
}