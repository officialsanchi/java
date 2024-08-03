import java.util.Scanner;
public class Al {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter your first name: ");
   String name1 = input.next();

   System.out.print("Enter your last name: ");
   String name2 = input.next();

   System.out.print("My name is " + name1 + " " + name2);
   }
}