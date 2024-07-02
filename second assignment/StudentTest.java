public class StudentTest{
	public static void main(String [] args){
	
	student account1 = newStudent("Jane Green", 93.5);
	student account2 = newStudent("John Blue", 72.75);

	System.out.printf("%S' s letter grade is : %s%n",account1.getName(), account1.getLetterGrade());

	System.out.printf("%S' s letter grade is : %s%n",account2.getName(), account1.getLetterGrade());



	}
}