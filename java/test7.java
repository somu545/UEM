class temp
{

	void show()
	{
		System.out.println("Hello Kolkata");
	}
}
class test7
{
	public static void main(String args[])
	{
		int i;
		temp  obj []=new temp[5];
		for(i=0;i<5;i++)
		{
			obj[i]=new temp();
			obj[i].show();
		}
	}
}