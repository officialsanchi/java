import java.util.Scanner;
public class Testt{
	public static void main (String [] args ){

		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter number : ");
		int number = input.nextInt();

		int diameter = number * number;

		double circumference = 2 * 3.14159 * diameter;
		double area = 3.14159 * (diameter  * diameter);

		System.out.printf(" the diameter is %d, the circumference is %f, and the area is %f" , diameter, circumference , area);
		}
	}