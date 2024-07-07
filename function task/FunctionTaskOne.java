public class FunctionTaskOne{

	public static boolean isEven(int number) {
	
	if (number % 2 == 0) return true;
	
        return false;
	}

	public static boolean isPrimeNumber(int number){
	
	for(int count = 0; count <= number/2; count ++)
	if (number %2 != 0 && number %3 != 0) return true;
	return false;
	}
	
	public static int subtract(int firstNumber, int secondNumber){
	 int sum = firstNumber - secondNumber;
	return sum;
	}
	public static float divide(float firstNumber, float secondNumber){
	float mulit = firstNumber / secondNumber;
	return mulit;
 	}
	public static int factorOf(int number){
	int prime = 0;
	for(int count = 1; count <= number; count ++){

	if(number % count == 0)
		 prime ++;
		
		}return prime;
	}
	public static boolean isSquare(int number){
	for(int count = 0; count <= number; count ++)
	if(count * count == number) return true;
	return false;
	}

 

}