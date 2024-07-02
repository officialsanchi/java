import java.util.Scanner;
public class Convert{
	public static void main(String [] args){
	
	Scanner input = new Scanner (System.in);

	System.out.print("Enter a number in pounds : ");
	double value = input.nextDouble ();

	double result = value * 0.454;
	
	System.out.print(result);

	}
}