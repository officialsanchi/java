import java.util.Scanner
public class Minus{
public static void main (String [] args){
 Scanner input = new Scanner (System.in)
	System.out.print("Enter first number : ");
	int number1 = input.nextInt ();
	System .out.print("Enter second number :");
	int number2 = input.nextInt ();
	
	int minus1 = number1 * number1;
	int minus2 = number2 * number2;
 	int minus3 = minus1 * minus2;
	int diff = minus1 - minus2;
	int sum = diff + diff; 
	
	System.out.println("The minus of firstnumber" + minus1);
	System.out.println (The minus of secondnumber" + minus2);
 	}}