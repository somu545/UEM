class A
{
	int average(int ...a)
	{
		int n = a.length;
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		return sum/n;
	}
}

class average_varargs
{
	public static void main(String args[])
	{
		A obj = new A();
		System.out.println("Average is: "+obj.average(5,5));
	}
}
