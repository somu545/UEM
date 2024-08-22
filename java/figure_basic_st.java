import java.util.Scanner;
class figure_basic_st
{
	static void figure(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}

public static void main(String args[])
	{
		figure(4);
	}
}
	