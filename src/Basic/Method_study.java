package Basic;

public class Method_study {
	static int a = 2020;
	static int b= 1992;
	static int c = 2013;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
disp();
disp2();
disp3();
	}
	public static void disp() {
		if(a%4==0 ) {
			
			System.out.println("1st year is a leap year");
			
		}
		else {
			System.out.println("1st is not a leap year");
		}
		
	}
	
	public static void disp2() {
		if (b%4==0) {
			System.out.println("2nd year is a leap year");
		}
		else {
			System.out.println("2nd is not a leap year");
		}

		
	}
	
	public static void disp3() {
		 if (c%4==0) {
				System.out.println("3rd year is a leap year"+c);	
			}
			 else {
				System.out.println("3rd year is not a leap year");
			}		
		
	}

}
