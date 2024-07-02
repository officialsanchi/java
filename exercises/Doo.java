import java.util.Scanner;
public class Doo{
	public static void main (String [] args ){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int number1 = input.nextInt();

		System.out.print("Enter second number : ");
		int number2 = input.nextInt ();

		int numberTripled = number1 *3;
		int numberDoubled = number2 *2;

		if ( numberTripled == numberDoubled ) {
		System.out.printf("the number1  %d  numberTripled %d is the number2 of %d is numberDoubled %d, therefore if the value of the %d tripled is equal to the value of the %d dobuled", number1, numberTripled, number2, numberDoubled, number1, number2);
		}
		
		else {
		System.out.printf("the value of  %d is tripled %d,the value of %d is doubled %d, therefore if the value of the %d tripled is not equal to the value of the %d dobuled" number1, numberTripled, number2, numberDoubled, number1, number2 );
");
		}
	}
}