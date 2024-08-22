import java.util.Scanner;
class A
{
	int fib(int n)
	{
		if(n==1 || n==2)
		{
			return n-1;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}
}

class fibo_recur
{
	public static void main(String args[])
	{
		A obj = new A();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value : ");
		int x=sc.nextInt();
		int result= obj.fib(x);
		System.out.println(result);
	}
}
