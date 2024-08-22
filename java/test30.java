
import java.util.Scanner;
 class A
 {
	int num,temp,sum=0,rem;
	void set_data()
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
		    sum=sum+(rem*rem*rem);
		}
	}

		void display()
		{
			if(temp == sum)
				System.out.println(" An Armstrong number.");
			else
				System.out.println("Not an Armstrong number.");
		}
		
}

class test30
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.set_data();
		obj.display();
	}
}