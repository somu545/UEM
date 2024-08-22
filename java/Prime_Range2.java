import java.util.Scanner;
class A
{
	int low,high,c,i,j;
	void get_data()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Lower bound: ");
		low=sc.nextInt();
		System.out.println("Enter the Higher bound: ");
		high=sc.nextInt();
	}
}

class B extends A
{
	void cal_prime()
	{
		for(i=low;i<=high;i++)
		{
			c=0;
			for(j=2;j<=i-1;j++)
			{
				if(i%j ==0)
				{
				  c=c+1;
				  break;
				}
		    }
		if(c==0)
		{
		System.out.println(i);
		
		}
	} 
		
	}
}


class Prime_Range2
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.get_data();
		obj.cal_prime();
	}
}	