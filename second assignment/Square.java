import java.util.Scanner;
 public class Square{
	public statsic void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int number1 = input.nextInt();

	 System.out.print("Enter second number : ");
	int number2 = input.nextInt();

	int square1 = number1 * number1;
	int square2 = number2 * number2;
	int square3 = square1 * square2;
	int diff = square1 - square2;
	int sum = diff + diff;

	
	System.out.println ("The square of firstnumber " + square1);
	System.out.println("The square of secondnumber " + square2);
	System.out.println ("The prouduct is  " + square3);
	System.out.print ( "The difference is " + diff);
	System.out.print (" The sum of difference" + sum);

	}
}