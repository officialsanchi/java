import java.util. Scanner;
public class Arithmetic{
	public static void main(String [] args){
 
	Scanner ari = new Scanner(System.in);

	System.out.print ( "Number one : " );
	int int1 = ari.nextInt();

	System.out.print ( "Number two  : " );
	int int2 = ari.nextInt();

	System.out.print ( "Number three : " );
	int int3 = ari.nextInt();

	int sum = int1+ int2+int3;
	int average =  sum/3;
	int product = int1*int2*int3;

	int largest = 0;
	int smallest =0;
	
	if(int1 > int2 && int1 > int3){	
       	  largest = int1;}
	if(int2 > int1 && int2 > int3){	
       	   largest = int2;}
	if(int3 > int1 && int3 > int2){	
       	  largest = int3;}

	
	if(int1 < int2 && int1 < int3){	
       	  smallest = int1;}
	if(int2 < int1 && int2 < int3){	
       	   smallest = int2;}
	if(int3 < int1 && int3 < int2){	
       	  smallest = int3;}




	System.out.println( " The sum is " + sum);
	System.out.println( " The average is " + average); 
	System.out.println( " The product is " + product);
 	System.out.println ( " The largest is "+ largest);
	System.out.print( " The smallest is " + smallest);
	}
}