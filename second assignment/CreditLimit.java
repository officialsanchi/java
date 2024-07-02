import java.util.Scanner;
public class CreditLimit{
	public static void main(String [] args){
	 
	Scanner input = new Scanner(System.in);

	System.out.print("Enter account number : ");
	int accountNumber = input.nextInt();

	System.out.print("Enter balance at the beginning of the month : ");
	int = input.nextInt();

	System.out.print("Enter total of all items charged by the customer this month : ");
	int number3 = input.nextInt();
	
	System.out.print("Enter total of all credits applied to the customer's account this month : ");
	int number4 = input.nextInt();
	
	System.out.print("Enter allowed credit limit : ");
	int number5 = input.nextInt();

	int num = number2;
	int numb = number3;
	int numbe = number4;
	int newNumber = num + numb - numbe;
	

	 
	if(number5 > newNumber){
	
	System.out.println("Credit limit exceeded");
		}

	System.out.print("The userNewBalance : "  + newNumber );
	}
}