import java.util.Scanner;
public class Work{
	public static void main(String [] args){
	
	Scanner dinma = new Scanner(System.in);
	
	System.out.print("Enter the radius : ");
	double number1 = dinma.nextDouble();;
	
	System.out.print("Ente the perimeter : ");
	double numer2 = dinma.nextDouble();

	double  radius = 6.5;
	double per = 6.5;
	double  pie = 3.14159;
	double perimeter = 2 * number1 * pie;
	double area = number1 * number1 * pie;

	System.out.println( perimeter);
	System.out.print(area);
	}
}