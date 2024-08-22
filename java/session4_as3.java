/*
3) Write a class Calculator that has the following members:
a) Two int: opp1 &amp; opp2
b) Four methods:
Add(), Subtract(),Multiply() &amp; Divide()
The functions will return the result of the corresponding operation into opp1 and
opp2 variables
Take user’s choice
*/

import java.util.Scanner;
class cal
{
	float opp1,opp2,sum=0;
	void get_input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of opp1: ");
		opp1=sc.nextFloat();
		System.out.println("Enter value of opp2: ");
		opp2=sc.nextFloat();
	}
	void Add()
	{
		sum=opp1+opp2;
		System.out.println("Addition =: "+sum);
	}
	void Subtract()
	{
		sum=opp1-opp2;
		System.out.println("Subtraction=: "+sum);
	}
	void Multiply()
	{
		sum=opp1*opp2;
		System.out.println("Multiplication =: "+sum);
	}
	void Divide()
	{
		sum=opp1/opp2;
		System.out.println("Division =: "+sum);
	}
}

class session4_as3
{
	public static void main(String args[])
	{
		cal obj= new cal();
		obj.get_input();
		obj.Add();
		obj.Subtract();
		obj.Multiply();
		obj.Divide();
	}
}
		