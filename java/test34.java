import java.util.Scanner;
class a
{
  int x,b=0,n,temp;
	Scanner sc=new Scanner(System.in);
	void data()
	{
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp = n;
		while(n>0)
		{
			x=n%10;
			n=n/10;
			b=b+(x*x*x);
		}
	}
	
	void show()
	{
		if(temp == b)
			System.out.println("This is an Armstrong number");
		else
			System.out.println("This is not an Armstrong number");
	}
}
class test34
{
    public static void main(String args[])
	{
	  a obj=new a();
	  obj.data();
	  obj.show();
	}
}