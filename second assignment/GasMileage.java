import java.util.Scanner;
public class GasMileage{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first promt : ");
		int drivingDistance = input. nextInt(); 
	
		System.out.print("Enter the secod promt : ");
		int milesPerGallon = input.nextInt();
	
		System.out.print("Enter the third promt : ");
		double pricePerGallon = input.nextDouble();

		double totalGallon = drivingDistance * pricePerGallon/ 			milesPerGallon;
		System.out.println("the driving distance is "+ 				totalGallon);
	


	}
}