class A
{
	int x=1;
	int fact_iterative(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<=n;i++)
			x*=i;
		}
		return x;
	}
}

class Fact_Iter
{
	public static void main(String args[])
	{	
		A obj = new A();
		System.out.println("Factorial is : "+obj.fact_iterative(4));
	}
}
