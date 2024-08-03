import java.util.Scanner;
public class Grade{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
		
		for ( int count = 0; count < 5; count ++){
	
		System.out.println("Enter alphabeth for 1 - 4 & 0 : ");
	
		int num = input.nextInt();

		if (num == 0){
		System.out.println("F");
		}
		if (num == 1){
		System.out.println("D");
		}
		if (num == 2){
		System.out.println("C");
		}
		if (num == 3){
		System.out.println("B");
		}
		if (num == 4){
		System.out.println("A");
		}
		
		
		}

	}
}