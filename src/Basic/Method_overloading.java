package Basic;

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//banking domain: overloading
		// create in both manner static and non-static
		// 3-method cashwithdrawal 
		// a-name,b-types(atm,check.cash)
		// b-name,amount,branch
		// c-name, amt , branch,pin,day,mob,acct type
		// then overload		
	//example of method overloading with static and non static method using diff parameters
		Method_overloading mo = new Method_overloading();
		mo.cashwithdrawal("Sanket", 'A');
		mo.cashwithdrawal("borivali", 200000);
		mo.cashwithdrawal(1212, 9892254761l, "savings", 'S');
		cashwithdrawal(123.1f, 1230);
	}

	public void cashwithdrawal(String name, char type) {

		System.out.println("name is " + name);
		System.out.println("Type is " + type);
	}

	public void cashwithdrawal(String Bname, long amount) {
		System.out.println("Bname is " + Bname);
		System.out.println("amount is" + amount);

	}

	public void cashwithdrawal(int pin, long mobno, String acctyp, char Day) {
		System.out.println("Pin is " + pin + " mob no is " + mobno + " acctype is " + acctyp + " Day is " + Day);

	}

	public static void cashwithdrawal(float bal, int pin) {
		System.out.println("pin is " + pin);
		System.out.println("balance is " + bal);

	}

}
