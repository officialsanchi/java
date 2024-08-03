import java.util.Scanner;
public class Statement{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter student grade score : ");
		int studentGrade = input.nextInt();
		
		
		if(studentGrade >= 80  ){
		System.out.println("A");
		}
		if (studentGrade >=70 ){
		System.out.println("B");
		}
		if(studentGrade >= 50){
		System.out.println("C");
		}
		if(studentGrade >= 0){
		System.out.println("D");
		}
		
		
		
	  }
	}
