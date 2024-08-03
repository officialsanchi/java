import java.util.Scanner;
public class Saves{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter saving month : ");
		double interest = input.nextDouble();

		
	
		double month1 = 100 * (1 + 0.003125);
		double month2 = (100 + 200.938) * (1 + 0.003125);
		double month3 = (100 + 301.8784765625) * ( 1 + 0.003125);
		double month4 = (100 + 403.1347808933258)*(1 + 0.003125);
		double month5 = (100 + 504.7070770836174)*(1 + 0.003125);
		double month6 = (100 + 606.5967866995037)*(1 + 0.003125);
		double month7 = (100 + 708.8049016579396)*(1 + 0.003125);
		double month8 = (100 + 811.3324169756207)*(1 + 0.003125);
		double month9 = (100 + 914.1803307786695)*(1 + 0.003125);
		double month10 = (100 + 1017.349644312353)*(1 + 0.003125);
		double month11 = (100 + 1120.841361950829)*(1 + 0.003125);
		double month12 = (100 + 1220.841361950829)*(1 + 0.003125);

	System.out.printf("%d %d %d %d %d %d %d %d %d %d %d %d", month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12);
		

	
		}
}