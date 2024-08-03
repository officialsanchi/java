import java.util.Scanner;
public class Task0{
	public static void main(String [] args ){

	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter first number : ");
	int number = input.nextInt();

	if ( number >=70 && number <= 100){
	System.out.print("A");
	}
	
	if ( number >=60  && number <= 69){
	System.out.print("B");
	}
	
	if ( number  >= 50 && number <= 59){
	System.out.print("C");
	}
	
	if ( number >= 40 && number <= 49){
	System.out.print("D");
	}
	
	else {
	System.out.print("Fail");

		}
	}
}
	

