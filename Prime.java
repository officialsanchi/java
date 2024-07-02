import java.util.Scanner;
public class Prime{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
		System.out.print("prompts the user : ");
		int number = input.nextInt();
		


		if(number %2 ==1){
	
		System.out.println("prime number");
		}

		else{
		System.out.println("not a prime number");
		}

	}
}