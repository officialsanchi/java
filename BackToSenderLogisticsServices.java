import java.util.Scanner;
public class BackToSenderLogisticsServices{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter daily packages : ");
	int number = input.nextInt();


	int collector = 0;


	if(number < 50){
	collector = number * 160 + 5000;
	
	}
	else if(number >= 50 && number <= 59 ){
	collector = number * 200 + 5000;
	

	}
	else if (number >= 60 && number <= 69 ){
	collector= number * 250 + 5000;

	

	}
	else if(number >= 70) {
	
	collector = number * 500 + 5000;
	

		}

	System.out.print ("The close of the day based on the number of successful delivery : " + collector);

	}
}