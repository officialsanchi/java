import java.util.Scanner;
public class Sales{
	public static void main(String [] args){
	
		Scanner input = new Scanner (System.in);
	
		double count = 0;
		double total = 0;

		while(count != -1){
		System.out.print("Enter items sold : ");
		count = input.nextDouble(); 
		
		double sum += count;
		double gross = sum * 0.09;
		total = 200 + gross;
		

		}
		System.out.println("Your gross payment for this whole week is " + total);
	}
}