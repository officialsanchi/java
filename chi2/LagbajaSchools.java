import java.util.Arrays;
import java.util.Scanner;
public class LagbajaSchools{
public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the number of students : ");
	int numberOfStudent = scanner.nextInt();
	
	System.out.println("Enter the number of subjects : ");
	int numberOfSubject = scanner.nextInt();

	int [][] number = new int [numberOfStudent] [numberOfSubject];

	int [] newScore = new int [numberOfStudent];
	double [] average = new double [numberOfStudent];

	int sum = 0;


	

	for(int index = 0, count = 1; index < numberOfStudent; index ++, count++){

	for(int element = 0, num = 1; element < numberOfSubject; element ++, num++){
	
	System.out.println("Enter scoring for student " +count+ "\nEnter score for subject "+num+": ");
	number[index][element] = scanner.nextInt();
	 
	sum += number[index][element];
		  }
	 newScore[index] = sum;
	 average[index] = sum / numberOfSubject;
	

	   }
System.out.println(Arrays.toString(newScore));
System.out.print(Arrays.toString(average));

	}
}
