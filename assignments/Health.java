import java.util.Scanner;
public class Health{
	public static void main(String [] args){
	
		Scanner input = new Scanner (System.in);

		System.out.print("Enter weight in pounds : ");
		double firstNumber = input.nextDouble();

		System.out.print("Enter height in inches : ");
		double secondNumber = input.nextDouble ();

		double  add =  secondNumber * secondNumber;
		double BMI=  add / firstNumber;

		System.out.print(BMI);

	 }
}