/*1) Write a method named div() that takes two arguments of either integer or float type
and returns their division either as int or as float depending upon its arguments data
type. */

import java.util.Scanner;
class A
{	
	float sum;
    float div(float a,float b)
	{
		sum=a/b;
		System.out.println("Division is: "+sum);
		return sum;
	}

}

class session4_as1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float m,n;
		System.out.println("Enter Values of A and B: ");
		m=sc.nextFloat();
		n=sc.nextFloat();
		A obj = new A();
		obj.div(m,n);
	}
}
	