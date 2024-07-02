import java.util.Scanner;
public class Fuel{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first promt : ");
	double drivingDistance = input. nextDouble(); 
	
	System.out.print("Enter the secod promt : ");
	double milesPerGallon = input.nextDouble();
	
	System.out.print("Enter the third promt : ");
	double pricePerGallon = input.nextDouble();

	double totalGallon = drivingDistance * pricePerGallon/ milesPerGallon;
	System.out.println("the driving distance is "+ totalGallon);
	


	}
}