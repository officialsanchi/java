import java.util.Scanner;
public class Task16{
	public static void main(String [] args ){
	Scanner input = new Scanner(System.in);
 	
	System.out.print("Enter first number");
	int number = input.nextInt();

	int square = number*number;
	if (square > 100){
	System.out.printf("%d > %d%n",square,100);
	}
	if (square < 100){
	System.out.printf("%d < %d%n",square,100);
	}
	if (square == 100){
	System.out.printf("%d = %d%n",square,100);
	}
	if (square != 100){
	System.out.printf("%d != %d%n",square,100);
	}

	


	
	
			

		}

	}