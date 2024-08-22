import java.util.Scanner;
class A
{
	int a,b,c,size,i;
	int arr[]=new int[5];
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
	System.out.println("Enter value of a: ");
	a=sc.nextInt();
	System.out.println("Enter value of b: ");
	b=sc.nextInt();
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
		System.out.println("Enter the size: ");
		size=sc.nextInt();
		for(i=0;i<size;i++)
		arr[i]=sc.nextInt();
	}catch(ArithmeticException e)
	{
		System.out.println(" Error !! Divided by zero");
	}catch(ArrayIndexOutOfBoundsException e)
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