class student
{
	student()
	{
		System.out.println("Default constructor");
	}
	student(int a)
	{
		System.out.println("Parameterised constructor"+a);
	}
	student(int b,int c)
	{
		System.out.println("Parameterised constructor"+b+" "+c);
	}
	student(int b,char c,float f)
	{
		System.out.println("Parameterised constructor"+b+" "+c+" "+f);
	}
	void show()
	{
		System.out.println("Normal method");
	}
	void show_1()
	{
		System.out.println("call show_1");
	}
}
class test8
{
	public static void main(String args[])
	{
		student obj1=new student();
		student obj2=new student(10);
		student obj3=new student(100,200);
		student obj4=new student(4,'a',25.5f);
		obj1.show();
		obj2.show();
		obj2.show_1();
		
		
	}
}

