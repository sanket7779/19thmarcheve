package Basic;

public class swapnumber {

	public static void main(String[] args) {
		int num = 234;
		int rem;
		int rev=0;
		while(num!=0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			//System.out.println(rev);
			
		}
		System.out.println(rev);
	}

}
