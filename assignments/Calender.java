import java.util.Scanner;
public class Calender{
	public static void main(String [] args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter the number of minutes : ");
	int number1 = input.nextInt();

	int oneHour = 60 * 24;
	int oneYear = 365 * oneHour;
	
	System.out.print(oneYear);
	

 	}
}