import java.util.Scanner;
public class Comp{
	public static void main(String [] args){
	
	Scanner input = new Scanner (System.in);

		boolean isIt = false;
		byte on = 00100;
		char attr = 'D'; 
		int agee = 40;
		long length = 7000;
		float meter = 3.546455f;
		double size = 34.064578358395982;


		System.out.printf( "%b %d %c %d  %d %f %f %n" , isIt, on, attr, agee, length, meter,size);

	
	}
}