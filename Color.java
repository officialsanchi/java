import java.util.Scanner;
public class Color{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter  color number : ");
		 int number1 = input.nextInt();

		 
                 if (number1 == 1){
	
		System.out.print("violet");
	}
		 if (number1 == 2 ){
	
		System.out.print("indigo");
	}
		if (number1 == 3){
	
		System.out.print("blue");
	}
		 if(number1 == 4){
	
		System.out.print("green");
	}
		 if (number1 == 5 ){
	
		System.out.print("yellow");
	}
		 if(number1 == 6){
	
		System.out.print("orange");
	}
		 if (number1 == 7){
	
		System.out.print("red");
	}
		if(number1 > 7){
		System.out.print("NotColor");
}


	}
}