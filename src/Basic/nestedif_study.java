package Basic;

public class nestedif_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 1234;
		int amount = 2000;
		if (pin == 1234) {
			if (amount == 2000) {
				System.out.println("transaction successful");
			} else {

				System.out.println("enter valid amount");
			}

		} else {

			System.out.println("wrong atm pin");
		}

	}

}
