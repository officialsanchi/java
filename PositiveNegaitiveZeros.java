import java.util.Scanner;
public class PositiveNegaitiveZeros{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	
	int positive = 0;
	int negaitive = 0;
	int zeros = 0;
	int number = 0;
	
	
	while(number != 1000){
		System.out.print("Enter the number till user wants to stop : ");
	 number = input.nextInt();
	


	if (number > 0 ){
	
	positive = positive + 1;
	
	}
	
	
	else if (number < 0 ){
	negaitive = negaitive + 1;
	
	}
	
	
	else {
	zeros = zeros + 1;
	}
		}
		System.out.print("The number of positive : " + positive + " ,");
		System.out.print("The number of negaitive : " + negaitive + " ," );
		System.out.print("The number of zeros : " + zeros + " , ");
	
	}
}