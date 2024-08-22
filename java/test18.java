class A
{
	int a;
	A(int b,int c)
	{
		a=b+c;
		System.out.println("sum is =" +a);
		
	}
}
	
class B extends A
{
	float z;
	B(int b,int c,float x,float y)
	{
		super(b,c);
		z=x+y;
		System.out.println("Sum in float=" +z);
	}
}

class C extends  B
{
	C(int b,int c,float x,float y,String str)
	{
		super(b,c,x,y);
		System.out.println("Your String: "+str);
	}
}

class test18
{
	public static void main(String args[])
	{
		C obj = new C(10, 10, 2.5f, 2.5f, "Somnath");
	}
}
		