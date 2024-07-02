import java.util.Scanner;
public class Codes{
	public static void main(String [] args){
	
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number : " );
		int number = input.nextInt();
	
		int total = 0;
	
		while( number > total){
			System.out.print("Enter second number : " );
		int second = input.nextInt();
	
			total += second;
	
			 }System.out.print("now equal to or greater than "+ number);
			
			

		
		
		}
	}