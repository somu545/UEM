package p1;
class Student1
{
	int n ;
	private int n_pri;
	protected int n_pro;
	public int n_pub;
	Student1()
	{
	n = 1;
	n_pri = 2;
	n_pro = 3;
	n_pub = 4;
	}
}
class Student2 extends Student1
{
	void Show()
	{
		System.out.println("No modifier="+n);
		//System.out.println("Private="+n_pri);
		System.out.println("Protected="+n_pro);
		System.out.println("Public="+n_pub);
	}
}
class Student3 
{
	void Show()
	{
		Student1 obj3=new Student1();
		System.out.println("No modifier="+obj3.n);
		//System.out.println("Private="+obj3.n_pri);
		System.out.println("Protected="+obj3.n_pro);
		System.out.println("Public="+obj3.n_pub);
	}
}

class access_modifier
{
	public static void main(String args[])
	{
		Student2 obj=new Student2();
		obj.Show();
		Student3 obj2=new Student3();
		obj2.Show();
	}
}
	
	