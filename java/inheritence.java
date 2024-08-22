class A
{
	void show()
	{
		System.out.println("In A class");
	}
}

class B extends A
{
	void display()
	{
		System.out.println("In B class");
	}
}
class test16
{
	public static void main(String args[])
	{
	  
	  B obj=new B();
	  obj.show();
	  obj.display();
	}
}