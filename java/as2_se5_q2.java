/*
2) Keep a constructor in the above Employee class that takes arguments name and
employee number. There will be a null constructor in class TeachingStaff. Now use
super to invoke the base class’s constructor */

import java.util.*;
abstract class Employee
{
	String Emp_Name;
	int Empno,sal = 40000;
	
	Employee(String name,int n)
	{
		Emp_Name = name;
		Empno = n;
	}
	abstract void salary();
}
class TeachingStaff extends Employee{
	String q = "Graduate";
	TeachingStaff(String s,int n)
	{
		super(s,n);
	}
	public void salary()
	{
		System.out.println(" Employee Name: "+Emp_Name+ "\n Employee No: "+Empno+"\n Employee salary: "+sal+"\n Employee qualification: "+q);
	}
}

class as2_se5_q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String s1 = sc.next();
		System.out.println("Enter Employee Code: ");
		int n1 = sc.nextInt();
	
		TeachingStaff obj = new TeachingStaff(s1,n1);
		obj.salary();
	}
}