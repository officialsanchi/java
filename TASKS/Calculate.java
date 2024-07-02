import java.util.Scanner;
public class Calculate{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.println ("Enter  first number : ");
	double number1 = input.nextDouble();
	
	System.out.println ("Enter annual number : ");
	double number2 = input.nextDouble();

	double yearly = 12;
	double monthly = number2 / yearly;
	double interest = number1 * monthly * yearly; 
	double inte = interest / 1200; 

	System.out.print(inte);
	

}
	
}