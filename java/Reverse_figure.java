class Reverse_figure
{
	static void get_input(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String args[])
	{
		get_input(5);
	
	}
}
