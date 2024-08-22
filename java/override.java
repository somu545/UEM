
class A
{
void show()
	{	
	System.out.println("in class A");
	}

}

class B extends A
{
	void show()
	{
		super.show();
		System.out.println("in class B");
	}
}

class test19
{
	public static void main(String args[])
	{
		B obj= new B();
		obj.show();
	}
}
