import java.util.Scanner;
public class Divide{
	public static void main(String [] args){
	 Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number : ");
	int number1 = input.nextInt();

	int num = number1 % 3;
	
	 if ( num == 0){
	System.out.printf("number entered is divisble by 3:  %d " , num );
	
	}
	else {
	System.out.printf(" number entered is not divisible by 3. You have a remainder of %d " , num);
}
	}
}
	