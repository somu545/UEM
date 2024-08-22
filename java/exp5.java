import java.util.Scanner;
class A
{
	int a,b,c,size,i;
	int arr[]=new int[5];
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
		System.out.println("Enter the size: ");
		size=sc.nextInt();
	try
	{
		System.out.println("Enter the elements: ");
		for(i=0;i<size;i++)
		arr[i]=sc.nextInt();
	}catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(" Error !! Array index out of bound");
	}
	}
}

class exp5
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.get_input();
	}
}
