package Logical_Programs;

public class Fibonacci_Use {

	public static void main(String[] args) {
int n=10;
//0 1 1 2
int a = 0 , b=1 , c;
for(int i=0;i<n;i++)
{
	
	c=a+b;
	a=b;
	b=c;
	System.out.print(" "+c);
}

	}

}
