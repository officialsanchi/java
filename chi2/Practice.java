import java.util.Scanner;
public class Practice{
	public static void main (String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int number = input.nextInt();


	switch (number){

	case 1:System.out.print("one");
	break;
	case 2 :System.out.print("two");
	break;
	case 3: System.out.print("three");
	break;
	case 4: System.out.print("four");
	break;

	default : System.out.print("wrong number");



}



}}