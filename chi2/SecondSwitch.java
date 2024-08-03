import java.util.Scanner;
public class SecondSwitch{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter student grade score : ");
		int studentGrade = input.nextInt();
		

		switch(studentGrade) {
		case 80: 
		
		System.out.print( " The grade score of case1 : " +   "A");
		break;
	
		case 70: 
		
		System.out.print( "  The grade score of case1 : " +  "B");
		break;
		
		case 60: 
		
		System.out.print( "  The grade score of case1 : " +   "C");
		break;

		case 50: 
		
		System.out.print( "  The grade score of case1 : " +  "D");
		break;
		
		case 40: 
		
		System.out.print( "  The grade score of case1 : " +   "E");
		break;
		}

		
		
		}
	}
