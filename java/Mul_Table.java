
import java.util.Scanner;
class A
{
	Scanner sc =new Scanner(System.in);
	int n,i;
	void get_input()
	{
		System.out.println("Enter the number: ");
		n=sc.nextInt();
	}
	void cal()
		{
			for(i=1;i<=10;i++)
			System.out.println(n+ "" +i+ "="+n*i);
		}
}

class Mul_Table
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.get_input();
		obj.cal();
	
	}
}

