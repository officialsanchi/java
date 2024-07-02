import java.util.Scanner;
public class LargestSmallest{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		
		
		System.out.println(" Enter the numbers : ");
		 int number = input.nextInt();

		int largest = number;
		int smallest = largest;
		
		while(number != -1 ){

		
		System.out.println(" Enter the numbers : ");
		  number = input.nextInt();

		if( number > largest){
		largest = number;
		}
		if (number < smallest && number != -1){
		smallest = number;
		}
		
		}
	System.out.println("The sum of the  smallest : " + smallest );
	System.out.print("The sum of the largest : " + largest);
	
		

	}
}