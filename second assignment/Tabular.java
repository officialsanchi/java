import java.util.*;
public class Tabular{
	public static void main(String [] args){
		System.out.println("n1\tnn2\tn3\tn4");
		for(int count = 0; count <=5; count ++){
		  int n2 = count * count;
		  int n3 = count * count * count;
		  int n4 = count * count * count * count;
		System.out.println(count + "\t" + n2 + "\t" + n3 + "\t" + n4);
		}
	}
}