public class BackToSenderServices{
	public static int backToSender(int collector){

		if (collector > 0 && collector <= 50){
		return collector * 160 + 5000;
		}
		else if (collector >= 50 && collector <= 59){
		return collector * 200 + 5000;
		}
		else if (collector >= 60 && collector <= 69){
		return collector * 250 + 5000;
		}
		else if (collector >= 70){
		return collector * 500 + 5000;
		}
		else{
		return 0;
		}






	}
 }