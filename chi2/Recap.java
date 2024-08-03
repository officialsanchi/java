import java.util.Scanner;
public class Recap{

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int counter = 1;

	while (counter <= 10){
	System.out.print("Enter score : ");
	int score = input.nextInt();
	
	sum = sum + score;

	counter= counter + 1;
		
		
		}
		System.out.print("The sum of the total score collected is : " + sum);
	}
}
