import java.util.Scanner;
class company{
	Scanner sc  = new Scanner(System.in);
	int ph,sal,hike,total;
	String n,a;
	company()
	{
		System.out.println("Your name: ");
		n = sc.nextLine();
		System.out.println("Your Phone No: ");
		ph = sc.nextInt();
		System.out.println("Your Address: ");
		a = sc.next();
		System.out.println("Your Salary: ");
		sal = sc.nextInt();
	}
	void cal()
	{
		System.out.println("Enter your Hike : ");
		hike=sc.nextInt();
		total = sal +(sal *hike/100);
		System.out.println("New salary = "+total);
	}

}
class hike_array_object
{
	public static void main(String args[])
	{
		int i;
		company obj[]  = new company[5];
		for(i=0;i<5;i++)
		{
			obj[i] = new company();
		}
		for(i=0;i<5;i++)
		{
			obj[i].cal();
		}
		
	}
}	
		