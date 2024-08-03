import java.util.Scanner;
public class Task26{
	public static void main(String []args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int number1 =input.nextInt(); 

	System.out.print("Enter second number : ");
	int number2 =input.nextInt();

	int number1Triple = number1 * 3; 
	int number2Double = number2 * 2;
	int total = number1Triple + number2Double;

	if (number1 * number2 == total){ 
	System.out.printf("the value of the first number tripled is equaled to %d " , "and the value of the second number dobuled is equal to %d", "therefore , the values of the number tripled  is %s%d, numnber1, number2, total");
}
	else {
	System.out.printf("the value of the first number tripled is equaled to %d, and the value of the second number dobuled is equal to %d " , "therefore, the values of the number tripled  is not equal %s%d, number1, number2, total");
}
		}
	}

	