import java.util.Scanner;
public class Task17{
	public static void main(String[] args ){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number : ");	
		int number1 = input.nextInt();
	
		System.out.print("Enter second number : ");	
		int number2 = input.nextInt();

		System.out.print("Enter third number : ");	
		int number3 = input.nextInt();
		
	int sum = number1 + number2 + number3;
	int average = sum / 3;
	int product = sum * average;

	//int smallest = 0;
	//int largest = 0;
	
	if  (number1 >= number2 && number1 >= number3) {
		System.out.println(number1);
	}

	if (number2 >= number1 && number2 >= number3) {
	System.out.println(number2);

	}

	 if (number3 >= number1 && number3 >= number2) {
	System.out.println(number3);
	}

	if (number1 <= number2 && number1 <= number3) {
	System.out.println(number1);
	}

	if (number2 <= number2 && number2 <= number3) {
	System.out.println(number2);
	}

	 if  (number3 <= number2 && number3 <= number2) {
	System.out.println(number3); 
	}
	
	System.out.println("Sum of " + number1 + "  & number2  " + number3  +"   is : " + sum);
	
	System.out.println("Product of " + sum + " & average " + average + " is : " + product);
	
	System.out.print("Average of "  +  product + " & sum  " + sum  + " is : " + average );
	//System.out.println(" The smallest is " + smallest);

	//System.out.println(" The largest is " + largest );


}	
}
	
	


		
	