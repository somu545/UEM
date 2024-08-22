import java.util.Scanner;
class A{
	
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
		System.out.println("Enter value of A: ");
		a = sc.nextInt();
		System.out.println("Enter value of B: ");
		b = sc.nextInt();
		
	}
}
	
	interface B {
		
		void cal();
	}
	
	
	class D extends A implements B
	{
		public void cal(){
		c= a+b;
		System.out.println("Sum is: "+ c);
		}
	}
	


class Hybrid_Inheritance
{
	public static void main(String args[])
	{
		D obj = new D ();
		obj.get_input();
		obj.cal();
	
	}
}
