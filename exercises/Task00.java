import java.util.Scanner;
public class Task00{
	public static void main( String [] args){
	 Scanner input = new Scanner(System.in);
 
 	System.out.print(" Enter first number  :");
	int number1 =input.nextInt();
	
	
 
	if ( number1 >= 70  && number1 <= 100){
	System.out.print("A");
	}
	
	if ( number1  >= 60  && number1 <= 69){
	System.out.print("B");
	}
	

	if ( number1 >= 50 && number1 <= 59){
	System.out.print("C");
	}
	
	if ( number1 >= 40 && number1 <= 49){
	System.out.print("D");	
	}

 
	else {
			System.out.print("Fail");

	}

	

	

	}
}