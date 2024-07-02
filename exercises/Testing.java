import java.util.Scanner;
public class Testing{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number : ");
		int number = input.nextInt();

		int diameter = number * number;
		double circumference = 2 * 3.14159 * diameter;
		double area = diameter * diameter;

		System.out.printf(" the diamter %d, the circmference %f, the area %f", diameter, circumference, area);
		}
	}