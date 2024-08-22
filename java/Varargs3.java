class Varargs3
{
	static int get_input(int ...arr)
	{
		int result=0;
		for(int a:arr)
		{
		result+=a;
		}
		System.out.println("Result: "+result);
		return result;
	}
public static void main(String args[])
	{
		get_input(1);
		get_input(1,5,7);
		get_input(3,5);
	}
}
