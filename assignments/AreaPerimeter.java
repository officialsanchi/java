import java.util.Scanner;
public class AreaPerimeter{
	public static void main(String [] args){
	
	Scanner input= new Scanner(System.in);

	System.out.print("Enter first number : ");
	double number1 = input.nextDouble();

	System.out.print("Enter second number : ");
	double number2 = input.nextDouble();


	double width = 5.3;
	double height = 8.6;
	double area = width * height;
	double perimeter = 2 * width + height;
	
	
	System.out.print(perimeter);
	
	  }
}