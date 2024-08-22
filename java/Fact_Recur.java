import java.util.Scanner;
class A
{
	int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
    	}
		else
		{
			return n*fact(n-1);
		}
	}
}

class Fact_Recur
{
	public static void main(String args[])
	{
		A obj = new A();
		System.out.println("Factorial is " +obj.fact(4));
		
	}
}
	