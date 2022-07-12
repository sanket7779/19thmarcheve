package Basic;

public class paramaterconstructor {
	String name;
	int age;
	char blood;
	String branch;
	double total;
	float percent;
	int num;
	int age1;
	
	
	public paramaterconstructor(String a, int b) {
		
	name = a;
	age = b;
		
	} 
	
	public paramaterconstructor(String c, int d, char e, String f, Double g, Float h) {
		
		name = c;
		age = d;
		blood = e;
		branch = f; 
		total = g;
		percent = h;
		
	}
	public paramaterconstructor() {
		
		num = 20;
		age1 = 30;
		int addition = num + age1;
		System.out.println("Addition is "+addition);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //paramaterconstructor pa3 = new paramaterconstructor();

		paramaterconstructor pa = new paramaterconstructor("sanket",20);
		pa.disp();
		
		
	paramaterconstructor pa1 = new paramaterconstructor("rahul", 20,'A', "Mechanical", 80.91d, 70.1f);

	pa1.disp1();
	
	}
	
	
	
	public void disp () {
		System.out.println("====================");
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("=====================");
		
	}
	
	public void disp1() {
		
		System.out.println("====================");
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Blood group is "+blood);
		System.out.println("Branch is "+branch);
		System.out.println("Total is "+total);
		System.out.println("Percent is "+percent);
		System.out.println("======================");
		
		
		
	}

}
