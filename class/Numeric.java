import java.util.Scanner;
public class Numeric{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print(" Enter first number : ");
	int firstNumber = input.nextInt();
	
	if (firstNumber % 2 == 0 ){System.out.print("You have entered an even number,now enter an odd number as a second number");
	}
        else{
	System.out.print("You have entered an odd number,now enter an even number as a second number");
	} 
	System.out.print(" Enter second number : ");
	int secondNumber = input.nextInt();


	if (firstNumber % 2 == 0 && secondNumber % 2 == 0){
		System.out.print("both numbers are even numbers,please put an odd number ");
	System.out.print(" Enter first number : ");
	int number1 = input.nextInt();
	
	if (number1 % 2 == 0 ){System.out.print("You have entered an even number,now enter an odd number as a second number");
	}
        else{
	System.out.print("You have entered an odd number,now enter an even number as a second number");
	} 
	System.out.print(" Enter second number : ");
	int number2 = input.nextInt();




	}
	else if (firstNumber % 2 != 0 && secondNumber % 2 != 0){
		System.out.print("both numbers are odd numbers,please put an even number ");
	}
	


	else{ 
              int sum = firstNumber + secondNumber;

	      System.out.print("The sum of two numbers is " +  sum);
		
		}
	}
}