import java.util.Scanner;
public class Test{
	public static  void main(String []args){
		Scanner input = new Scanner(System.in);
 		
		System.out.print("Enterfirst number : ");
		int number1 =  input.nextInt();
		
		System.out.print("Enter second number : ");
		int number2 =  input.nextInt();

		System.out.print("Enter third number : ");
		int number3 =  input.nextInt();
	
		int result = number1*number2*number3;

	
		System.out.printf("%s%d ","the sum is:  " ,result);

		}
	}



		