class A
{
	static int get_input(int x,int y)
	{
		int z;
		if(x>y)
		{
			z=x+y;
		}
		else
		{
			z=x-y;
		}
		return z;
	}
}
class static_logic2
{
	public static void main(String args[])
	{
		int a=3;
		int b=7;
		int c;
		c = A.get_input(7,4);
		System.out.println("Output is: "+c);
		
	}
}