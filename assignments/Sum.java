import java.util.Scanner;
public class Sum{
	public static void main(String [] args ){
	
		Scanner input = new Scanner (System.in);
		
	
		int counter = 0;
	
		
		for( counter =1; counter <= 100  ; counter ++ ){

		if ( counter %2 == 1){
		
		System.out.print(" odd : " +  counter  +  " " );
		}
		else {
		System.out.println (" even : " +  counter  + " "  );		
		
		
			}
		}
		
	}
}