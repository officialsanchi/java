import java.util.Scanner;
public class Collect{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter score1 : " );
		int score1 = input.nextInt();
	
		System.out.print("Enter score2 : " );
		int score2 = input.nextInt();

		System.out.print("Enter score3 : " );
		int score3 = input.nextInt();

		System.out.print("Enter score4 : " );
		int score4 = input.nextInt();

		System.out.print("Enter score5 : " );
		int score5 = input.nextInt();

		System.out.print("Enter score6 : " );
		int score6 = input.nextInt();

		System.out.print("Enter score7 : " );
		int score7 = input.nextInt();

		System.out.print("Enter score8 : " );
		int score8 = input.nextInt();

		System.out.print("Enter score9 : " );
		int score9 = input.nextInt();

		System.out.print("Enter score10 : " );
		int score10 = input.nextInt();
	
	
		int sum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 ;
		int average = sum/ 10; 

		
		
   
	
	   
		System.out.println("The sum of score " + sum);
		System.out.print("The average of the sum of score " + average);

			}
		
	
	
   }