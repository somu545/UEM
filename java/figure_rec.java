import java.util.Scanner;
class A
{
	void pattern(int n)
	{
		if(n>0)
		{
			pattern(n-1);
			for(int i=0;i<n;i++)
			{
				System.out.print("*");
			}
			System.out.println();
	    }
	}
}

class figure_rec
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.pattern(5);
	}
}
		