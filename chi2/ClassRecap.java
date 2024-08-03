import java.util.Scanner;
public class ClassRecap{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		int number = 0;
		
		int sum = 0;

		do{
		
		System.out.print("Enter score : ");
		int score = input.nextInt();
	
		sum = sum + score;
		number ++;
		}while (number < 10);

		System.out.println("The sum of number entered is : " + sum);


	}
}