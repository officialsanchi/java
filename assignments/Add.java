import java.util.Scanner; 
public class Add{
	public static void main (String []args ){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter  a number : ");
		int number = input.nextInt();

		
		
		int sum = number / 1000 % 100;
		int div = number / 1000 % 100 % 10;

		int add = number %10  ;
		
		
		System.out.println(sum);
		System.out.println(div);
		
		
		System.out.print(add);
	
		
		
		
		
		
		}
	}