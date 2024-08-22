/*Create a class called Employee that has two member variables: ename, empno, salary.
Now derive a new class called TeachingStaff from the Class Employee and this class
should override the function salary. (It may contain a member variable called
qualifications).*/

import java.util.*;
abstract class Employee
{
	Scanner sc = new Scanner(System.in);
	String Emp_Name;
	int Empno,sal;
	abstract void salary();
}
class TeachingStaff extends Employee{
	String q = "Graduate";
	public void salary()
	{
		System.out.print("Employee Name: ");
		Emp_Name = sc.nextLine();
		System.out.print("Employee No: ");
		Empno= sc.nextInt();
		System.out.print("Employee Salary: ");
		sal = sc.nextInt();
	
		System.out.println(" Employee Name: "+Emp_Name+ "\n Employee No: "+Empno+"\n Employee salary: "+sal+"\n Employee qualification: "+q);
	}
}

class as2_session5
{
	public static void main(String args[])
	{
		TeachingStaff obj = new TeachingStaff();
		obj.salary();
	}
}