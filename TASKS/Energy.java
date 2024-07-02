import java.util.Scanner;
public class Energy{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Amount of water ");
	double number1 = input.nextDouble();

	System.out.print("Enter the initial ");
	double number2 = input.nextDouble();
	
	System.out.print("Enter the final ");
	double number3 = input.nextDouble();

	

	 double temp =  number3 - number2;
	 double numb = number1 * temp * 4184;

	System.out.print(numb);
	 

	



	}
}