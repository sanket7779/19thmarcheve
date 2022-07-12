package Basic;

public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a = new Atm();
		Cheque c = new Cheque();
		
		a.bankdetails(1345, "Current");//dynamic binding 
		c.bankdetails(1345, "savings");//dynamic binding
		
		c.bankdetails(1345, "Current");
		a.bankdetails(1345, "savings");



	}

}
