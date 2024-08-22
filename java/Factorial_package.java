package p2;
import java.util.Scanner;
class setdata
{
	int a ,b=1,n;
	void cal()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		n=sc.nextInt();
		for(a=1;a<=n;a++)
		{
			b=b*a;
		}
		System.out.println("Factorial is: " +b);
	}
}
class Factorial_package
{
	public static void main(String args[])
	{
		setdata obj = new setdata();
		obj.cal();
	}
}



		






