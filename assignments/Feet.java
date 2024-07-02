import java.util.Scanner;
public class Feet{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);

		System.out.print (" Enter first number : ");
		double feetNumber = input.nextDouble();
		
		System.out.print(" Enter value for feet : ");
		double meters = input.nextDouble();

		
		double result = meters * feetNumber;

		System.out.print( "the  display result " + result);

		}
}