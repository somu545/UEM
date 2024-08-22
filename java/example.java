class A
{
	void get_input(int ...arr)
	{
		int sum=0;
		for(int a:arr)
		{
			sum+=a;
		}
		System.out.println("Sum is : "+sum);
	}
}

class example 
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.get_input(1);
		obj.get_input(1,6,4);
	}
}
		
		