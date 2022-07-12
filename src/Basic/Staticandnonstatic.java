package Basic;

public class Staticandnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
W3info();

test ma = new test();
ma.stud("sanket", 20, 'a', "mumbai", 90.1f);
	}

	public static void W3info()
	{
		
		String name;//declaration
		int age;
		char grade;
		String city;
		float percent;
		
		name = "Ganesh";//initialize
		age = 20;
		grade = 'a';
		city = "Pune";
		percent = 90.8f;
		
		System.out.println("Name is " + name);
		System.out.println("Age is "+ age);
		System.out.println("Grade is " +grade);
		System.out.println("City is " + city);
		System.out.println("Percent is"+percent);
		System.out.println("output is " + name + " "+ age+" "+ grade+" "+ city+" "+ percent);
		
	
		
		
		
	}
	
	
}
