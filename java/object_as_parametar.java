class object
{
	int a=5,b=5;
	int total;
	void show(sum s)
	{
		total = s.a+s.b;
		System.out.pritnln("sum is " +total);
	}
}

class object_as_parametar
{
	public static void main(String args[])
	{
		sum obj = new sum()
		obj.show(obj);
	}
}

	