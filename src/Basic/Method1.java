package Basic;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method3.disp();
		A1();
		Method2.A2();
		Method1 ma = new Method1();
		ma.B1();
		Method2 mb = new Method2();
		mb.B2();

	}

	public static void A1() {

		System.out.println("This is static A1 ");
	}

	public void B1() {

		System.out.println("This is non static B1");

	}

}
