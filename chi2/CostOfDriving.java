import java.util.Scanner;
public class CostOfDriving{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving diatance : ");
		double drivingDistance = input.nextDouble();

		System.out.print("Enter miles per gallon : ");
		double milesPerGallon = input.nextDouble();

		System.out.print("Enter price per gallon : ");
		double pricePerGallon = input.nextDouble();



		double total = drivingDistance * pricePerGallon;
	
		double costOfDriving = total / milesPerGallon;


		System.out.print("The total cost of driving distance is " + costOfDriving);

	
		}
	}