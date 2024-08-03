import java.util.Scanner;
public class MortgageCalculator{
	public static void main(String [] args){

	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter customer's name :");
	String name = input.nextLine();

	double monthlyPayment;
	
	
	System.out.print("Amount customer/ user wishes to borrow / collect : ");
	double amount = input.nextDouble();
	System.out.print("Yearly Interest rate offered on mortgage : ");
	int interestRate = input.nextInt();
	System.out.print("Enter the duration rate for the mortgage in years : ");
	int duration = input.nextInt();
	

	int interestRatePercentage = interestRate / 100;
	double monthlyPayment = amount  * (interestRatePercentage * Math.pow(1 + interestRatePercentage), duration) )/ (Math.pow(1 + interestRatePercentage), duration) - 1);
	


System.out.print ("Customer's name :"+name);
System.out.print("interest rate per month : "+monthlyPayment );
	
	

	}
}