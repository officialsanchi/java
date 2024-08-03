import java.util.Scanner;
public class Eight{
	public static void main (String [] args ){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter an integer : ");
	int number1 = input.nextInt();
	
	System.out.print("Enter an integer : ");
	int number2 = input.nextInt();
	
	int sum = number1 * number2;

	System.out.print(" result is " + sum);
	

	 }
}