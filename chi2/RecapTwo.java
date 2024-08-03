import java.util.Scanner;
public class RecapTwo{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
		 int score = 0;
		
		int stopper = -1;
		int sum = 0;
			
		while (score != stopper){
		
		
		sum = sum + score;

		System.out.println("Enter  score  or enter -1 to stop: " );

		 score = input.nextInt();


		}
		System.out.println("The sum of the total score is : " + sum );

	}
}

