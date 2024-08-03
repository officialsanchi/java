import java.util.Scanner;
public class Alpha{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = input.nextInt();
		
		if (number == 1){
		System.out.print("ONE");
		}
		
		 if (number == 2){
		System.out.print("TWO");
		}

		if (number == 3){
		System.out.print("THREE");
		}
		 if (number == 4){
		System.out.print("FOUR");
		}
		 if (number == 5){
		System.out.print("FIVE");
		}
		 if (number == 6){
		System.out.print("SIX");
		}
		 if (number == 7){
		System.out.print("SEVEN");
		}
		 if (number == 8){
		System.out.print("EIGHT");
		}
		if (number == 9){
		System.out.print("NINE");
		}
		if (number == 10){
		System.out.print("TEN");
		}
		if(number <1 || number > 10) {
		System.out.print("Invalid");
			}
		}
	}



