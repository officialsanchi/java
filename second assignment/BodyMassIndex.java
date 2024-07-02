import java.util.Scanner;
public class BodyMassIndex{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight :");
		double number1 = input.nextDouble();

		System.out.print("Enter the height :");
		double number2 = input.nextDouble();

		double num = number1;
		double numbe = number2 * number2;
		double BMI = num / numbe;

		System.out.print(BMI);

	}
}
		


		

