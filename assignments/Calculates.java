import java.util.Scanner; 
public class Calculates{
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print ("Enter the amount of water in kilograms : ");
		double number1 = input.nextDouble();
	
		System.out.print ("Enter the initial temperature : ");
		double number2 = input.nextDouble();
	
		System.out.print ("Enter the final temperature : ");
		double number3 = input.nextDouble();
	
		
		double  minus = number3 - number2 ;
		double Energyc =  number1 * minus  * 4184;
		
		System.out.print(Energy);

		}}