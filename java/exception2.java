import java.util.Scanner;
class A
{
	int a,b,c,sum=0;
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
	System.out.println("Enter value of a: ");
	a=sc.nextInt();
	System.out.println("Enter value of b: ");
	b=sc.nextInt();
	System.out.println("Enter value of c: ");
	c=sc.nextInt();
	}
	
}
class B extends A
{
	void cal()
	{
	try
	{
		sum=(a+b+c)/c;
		System.out.println("TRY-> Sum is : "+sum);
	}catch(ArithmeticException e)
	{
		System.out.println(" Error !! Divided by zero");
	}
}
}

class exception2
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.get_input();
		obj.cal();
		}
}