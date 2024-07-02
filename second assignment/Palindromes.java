import java.util.Scanner;
public class Palindromes{
	public static void main(String [] args){
	
		Scanner input = new Scanner (System.in);

		  System.out.print("Enter first number : ");
		  int number = input.nextInt();
		
		  int one = number / 10000;
		  int two = number / 1000;
		  int three = number / 100;
		  int four = number / 10;
		  int five = number % 10;

		while(number / 10000 == 0){

		if (one == five){
		System.out.print("pallerdrome");
		break;
		}

		else {
		System.out.print("Enter a new value:");
		int num = input.nextInt(); 
		}



		}

		}
	}

		

		
		   
