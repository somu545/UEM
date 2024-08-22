import java.util.*;

class fibo
{  
	int n1=0,n2=1,n3,i,no;
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
	System.out.println("Enter number: ");
	no = sc.nextInt();
	System.out.println("Fibonacci series upto "+no+" terms");
	System.out.print(n1+" "+n2);
	for(i=2;i<no;i++)
		{
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
class fibonacci_series
{
	public static void main(String args[])  
	{    
		fibo obj = new fibo();
		obj.get_input();
}	}  