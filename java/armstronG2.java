
import java.util.Scanner;
 class A
 {
	int num,entr,sum=0,rem,n=0,r;
	void set_data()
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		num =entr;
		
		while(num !=0)
		{
			num/=10;
			++n;
		}
		num=entr;
		while(num !=0)
		{
			r=num%10;
			sum=sum+pow(r,n);
			num=num/10;
		}
	}
		void display()
		{
			if(sum == entr)
				System.out.println(" An Armstrong number.");
			else
				System.out.println("Not an Armstrong number.");
		}
}

class armstronG2
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.set_data();
		obj.display();
	}
}