class A
{
	A(int a){
	System.out.println("a="+a);
	}
}

class B extends A
{
	B(int r,float b)
	{
		super(r);
		System.out.println("b="+b);
	}
}
class C extends B
{
	C(int q,float w,char c)
	{  
		super(q,w);
		System.out.println("c="+c);
	}
}

class test17
{
	public static void main(String args[])
	{
		C obj = new C(10,5.6,'y');
	}
	
}
	
	