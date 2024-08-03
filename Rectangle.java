import java.util.Scanner;
public class Rectangle{
	public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number : ");
	double number1 = input.nextDouble();

	System.out.print("Enter second number  : ");
	double number2 = input.nextDouble();

	double  width = number1;
	double  height = number2;
	
	double area = number1 * number2;
	double perimeter = 2 * (number1 + number2);

	System.out.println(area);

	System.out.print(perimeter);
	}
}