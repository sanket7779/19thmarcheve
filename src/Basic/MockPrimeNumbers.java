package Basic;

public class MockPrimeNumbers {

	public static void main(String[] args) {
		//101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197 and 199
		
		int i = 0;
		int num = 0;
	
		String primeNumbers = "";

		for (i = 100; i <= 200; i++) {
			int sum = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					sum = sum + 1;
				}
			}
			if (sum == 2) {
				
				primeNumbers = primeNumbers + i+" " ;
				
			}
		}
		
		System.out.println(primeNumbers);
	}
}


