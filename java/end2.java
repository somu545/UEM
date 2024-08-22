package p1;
class data
{
	protected float n;
	void get_data()
	{
		n=70;
	}
}

class data2 extends data
{
	float per;
	void show()
	{
		per= (70*90)/100;
		System.out.println("percentage is :" +per);
	}
}
class end2
{
	public static void main(String args[])
	{
		data2 obj = new data2();
		obj.show();
	}
}