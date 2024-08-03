import java.util.Scanner;
import java.util.Arrays;
public class Men{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	
	int [] age = new int [20];
	//int [] add = new int[20];
	
	for (int index = 19; index < age.length; index --){
	//int add = age.length -1;
	
	
	
	System.out.println("Enter number " + (index+1)+  " : " );
	
	 int number = input.nextInt();
	
	age [index] = number;

	
	
	
	}
	
	System.out.println(Arrays.toString(age));

	}
}