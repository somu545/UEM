 abstract class temp1  //abstract class
 {
	void show1()
	{
		System.out.println("show1 method");
	}
	abstract void display1();
	
}

class temp2 extends temp1
{
	void show2()
	{
		System.out.println("show2 method");
	}
    void display1() //override
	{
		System.out.println("display1 method");
	}
}
class test20
{
	public static void main(String args[])
	{
		temp2 obj = new temp2();
		obj.show1();
		obj.show2();
		obj.display1();
		
	}
}

