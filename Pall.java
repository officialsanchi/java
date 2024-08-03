import java.util.Scanner;
public class Pall{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number : ");
	int number = input.nextInt();


	int num = number / 100;
	int rev = number % 10;


	if (num == rev ){
	
	System.out.print("pallerdrome");

}
	else {
		System.out.print("not a pallerdrome");
}

		}
	}