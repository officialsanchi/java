import java.util.Scanner;
public class Circle{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter radius number :");
		double number1 = input.nextDouble();

		double pie = 3.14159; 
		double diameter = 2 * number1;
		double circumference =2 * pie * number1;
		double area = pie * number1 *number1;

		System.out.print(diameter);
		System.out.print(circumference);
		System.out.print(area);
	 }
}