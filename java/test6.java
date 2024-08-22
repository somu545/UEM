class rect
{
	int l,b,ar;
	void set_data()
	{
		l=2;
		b=4;
	}	
	void area()
	{
		ar=l*b;
	}
	void show_data()
	{
		System.out.println("Area is="+ar);
	}
}
class test6
{
	public static void main(String args[])
	{
		rect obj=new rect();
		obj.set_data();
		obj.area();
		obj.show_data();
	}
}