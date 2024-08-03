import java.util.Scanner;
public class TaskIb{
	public static void main (String [] args){
	
		Scanner input = new Scanner (System.in);

		System.out.print("First number : ");
		int number1 = input.nextInt();

		System.out.print("second number : ");
		int number2 = input.nextInt();


		int numberTripled = number1 * 3;
		int numberDouble = number2 *2;


		if( numberTripled == numberDouble ){
		System.out.printf("The value of %d tripled is %d, the value of %d doubled is %d, therefore  the value of %d trippled is equal to the value of %d doubled", number1, numberTripled, number2, numberDouble, number1, number2);
}
		else {
		System.out.printf("The value of %d tripled is %d, the value of %d doubled is %d, therefore  the value of %d trippled is not equal to the value of %d doubled", number1, numberTripled, number2, numberDouble, number1, number2);
	
}
	

		

	 }
}	