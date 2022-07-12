package Basic;

public class Elseif_study {

	public static void main(String[] args) {
       //program to cal telephone bills
		//min Rs 200 for 100 calls
		//plus Rs 0.6 for next 50 calls
		//plus Rs  0.5 for next 50 calls
		//plus Rs 0.4 for any call beyond 200 calls
		
		int calls = 300;
		double bill ;
		
		if(calls <=100) {
			
			bill =200;
		}
		else if(calls <=150) {
			bill = 200+(calls-100)*0.6;
			
		}else if(calls <=200) {
			
			bill = 200+50*0.6+(calls-150)*0.5;
		}else {
			
			bill = 200+50*0.6+50*0.5+(calls - 200)*0.4;
		}
		
		System.out.println("bill is "+bill);
		
		
		
		
	}

}
