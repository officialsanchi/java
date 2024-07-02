import java.util.Scanner;
public class Cal{
	public static void main(String [] args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter the number of minutes : ");
	long number1 = input.nextLong();

	long minDay = 60 * 24;

	long mintuesInADay = minDay * 365 ;
	long mintuesInAYear = number1 / mintuesInADay;

	long mintuesInDays = minDay * mintuesInADay;
	
	System.out.print(mintuesInAYear);
	System.out.print( mintuesInDays);
	

 	}
}