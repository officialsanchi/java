import java.util.Scanner;
public class Student{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		int numberOfScore = 0;
		 while (numberOfScore != - 1){

		System.out.print("Enter your score : ");
		int numberOfScore = input.nextInt();

		

		if (numberOfScore >= 60){
		System.out.print("You pass the exam");
		}

                else if(numberOfScore != -1 && numbrOfScore <= 50){
                   System.exit(0);
                 }

		else{
		System.out.print("You don't pass the exam");
		}
               	
	}
}