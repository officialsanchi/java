import java.util.Scanner;
public class Task25{
	public static void main(String [] args){
	 Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number : ");
	int number1 = input.nextInt();

	int y = number1 % 3;
	
	 if ( y == 0){
	System.out.printf("number entered is divisble by 3:  %d " , y );
	
	}
	else {
	System.out.printf(" number entered is not divisible by 3. You have a remainder of %d " , y);
}
	}
}
	