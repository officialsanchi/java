import java.util.Scanner;
public class Zeros{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number : ");
	int number = input.nextInt();
	
	
	for(int counter = 0; counter <= 20; counter ++){
	  number = counter + 1;
	System.out.print("The sum of number is : " + number);
		}
	
	

	}
}