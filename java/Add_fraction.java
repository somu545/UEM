//numerator/denominator

import java.util.*;
class fraction
{
	private int a,b,c,d,n=0,s=0;
	public fraction()
	{
		a=0;
		b=0;
		c=0;
		d=0;
	}
	public fraction(int nu1, int nu2, int di1, int di2)
	{
		a = nu1;
		b = nu2;
		c = di1;
		d = di2;
	}
	
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of first Numerator: ");
		a=sc.nextInt();
		System.out.println("Enter the value of first Denominator: ");
		b=sc.nextInt();
		System.out.println("Enter the value of second Numerator: ");
		c=sc.nextInt();
		System.out.println("Enter the value of Second Denominator: ");
		d=sc.nextInt();
		
	}
	public void cal()
	{
		if(b==d)
		{
			n = a + c;
			s = b;
		}
		else
		{
			n = (a*d) + (b * c);
			s=b*d;
		}
		System.out.println("The Numerator is: "+n);
		System.out.println("the Denominator is: "+s);
	}
}

class Add_fraction
{
	public static void main(String args[])
	{
		fraction obj = new fraction();
		obj.read();
		obj.cal();
		
		fraction obj1 = new fraction(2,4,6,4);
		obj.cal();
	}
}