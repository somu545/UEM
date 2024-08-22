class A
{
	int sumRec(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+sumRec(n-1);
		}
	}
}

class Sum_natural_Rec
{
	public static void main(String args[])
	{
		A obj = new A();
		System.out.println("Sum is: "+obj.sumRec(5));
	}
}
