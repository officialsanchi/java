import java.util.Scanner;
public class AreaOfACircle{
	public static void main(String [] args){
	
	Scanner input= new Scanner(System.in);

	System.out.print("Enter first number : ");
	double number1 = input.nextDouble();

	System.out.print("Enter second number : ");
	double number2 = input.nextDouble();


	double pie = 3.14159;
	double radius = 6.5;
	double Perimeter = 2 * radius* pie;
	double area = radius * radius * pie;
	
	
	System.out.print(area);
	
	  }
}