//4) Write a program to swap two numbers without using any temporary variable.

import java.util.Scanner;
class as3_q4
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of A" );
		a=sc.nextInt();
		System.out.println("Enter value of B" );
		b=sc.nextInt();
		
		System.out.println("Before swapping: A= "+a+ "\tB="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: A= "+a+ "\tB= "+b);
	}
}