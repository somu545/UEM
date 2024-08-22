import java.util.Scanner;
class distance
{
	int f , i;
	void get() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter feet:- ");
		f = sc.nextInt();
		System.out.print("Enter inches:- ");
		i = sc.nextInt();
	}
	void add(distance d1, distance d2)
	{
		int feet = d1.f + d2.f;
		int inch = d1.i + d2.i;
		int c = 0,a;
		
		if(inch > 12)
		{
			a=inch/12;
			feet+=a;
			inch=inch%12;
		}
		System.out.println("Sum of distances:-");
		System.out.println(feet + " feet and " + inch+" inch");
	}
}
class test32
{
	public static void main (String[] args)
	{
		distance d1 = new distance();
		distance d2 = new distance();
		System.out.println("Enter first distance ");
		d1.get();
		System.out.println("Enter second distance ");
		d2.get();
		d1.add(d1,d2);
	}
}