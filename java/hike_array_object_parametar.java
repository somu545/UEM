import java.util.Scanner;
class company{
	Scanner sc = new Scanner(System.in);
	int ph,sal=0,hike,total;
	String n,a;
	company(String w,int x,String y,int z,int h)
	{
		n = w;
		ph = x;
		a = y;
		sal = z;
		hike = h;
	}
	void cal()
	{
		total = sal +(sal *hike/100);
	}
	void display()
	{
		System.out.println("Your name: "+n);
		System.out.println("Your Phone No: "+ph);
		System.out.println("Your Address: "+a);
		System.out.println("Your Salary: "+sal);
		System.out.println("New salary = "+total);
		
	}
		

}
class hike_array_object_parametar
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int i,ph,sal,hike,total;
		String n,a;
		company obj[]  = new company[5];
		for(i=0;i<2;i++)
		{	
			System.out.println("Your name: ");
			n=sc.next();
			System.out.println("Your Phone No: ");
			ph=sc.nextInt();
			System.out.println("Your Address: ");
			a=sc.next();
			System.out.println("Your Salary: ");
			sal=sc.nextInt();
			System.out.println("Enter your Hike : ");
			hike=sc.nextInt();
			obj[i]= new company(n,ph,a,sal,hike);
		}
		for(i=0;i<2;i++)
		{
			obj[i].cal();
		}
		for(i=0;i<2;i++)
		{
			obj[i].display();
		}
		
	}
}	
		