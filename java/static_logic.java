class static_logic
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
	public static void main(String args[])
	{
		int a=3;
		int b=7;
		int c;
		c= get_input(a,b);
		System.out.println("output is: "+c);
	}
}