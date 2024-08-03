import java.util.Scanner;
public class Sub{
	public static void main(String [] args ){
		Scanner input = new Scanner (System.in);
			
		System.out.print ("Enter first number");
		int number1 = input.nextInt();
		
		System.out.print ( "Enter second number");
		int number2 = input.nextInt ();
			
		int square1 = number1 * number1;
  		int square2 = number2 * number2;
		int square3 = square1 * square2;
		int diff = square1 - square2;
		int sum = diff + diff;
		
		System.out.println (" The square of number1" + square1);
		System.out.println ("The square of number2" + square2);
		System.out.println ("The product is " + diff);
		System.out.println ("The sum of difference " + sum);
		}
	}
