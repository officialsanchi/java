import java.util.Scanner;
public class Pall{
	public static void main(String [] args ){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();

		//int six number / 10000;
		int value = number / 1000;
		int one = value % 10;
		int two = number / 100; 
		int value1 = two % 10;
		int three = number / 10;
		
		int four = three % 10 ;
		
		int five =  number % 10;	
		
		int six = number / 10000;
		
		
		
		
		
		System.out.printf(" %d %d  %d %d %d"  , six , one, value1,   four, five);
		

		


	
		//if(one == five && four == two && three == three && two == four && five == one ){
		//System.out.print("is a pallidrome");

		//}
		//else{
		//System.out.print("not a a parlidrome");
		//}
	}
}