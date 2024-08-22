import java.util.Scanner;
class A
{
	int a,b,c;
	int arr[]=new int[5];
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
	System.out.println("Enter value of a: ");
	a=sc.nextInt();
	System.out.println("Enter value of b: ");
	b=sc.nextInt();
	
	System.out.println("Enter the size of the array: ");
	size=sc.nextInt();
	int array[]=new int[size];
	}
	
}
class B extends A
{
	void cal()
	{
	try
	{
		c=a/b;
		System.out.println("TRY-> Sum is : "+c);
	}catch(ArithmeticException e)
	{
		System.out.println(" Error !! Divided by zero");
	}catch(ArrayIndexOutOfBoundsExceeption e)
	{
	System.out.println(" Error ! Array index out of bound");
	}
}
}

class exception3
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.get_input();
		obj.cal();
		}
}