import java.util.Scanner;
class A
{
	int n,i,j;
	Scanner sc =new Scanner(System.in);
    void figure()
	{
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

class figure_basic
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.figure();
	}
}
	