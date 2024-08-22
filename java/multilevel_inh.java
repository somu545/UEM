
 import java.util.Scanner;
 abstract class A  //abstract class
 {
	Scanner sc = new Scanner(System.in);
	int b;
	String a;
	void show1()
	{
		System.out.println("Enter the Name: ");
		a = sc.nextLine();
		System.out.println("Enter Roll: ");
		b = sc.nextInt();
	}
	
	abstract void display1();
	
}

 class B extends A
{
	int java,dbms;
	void show2()
	{
		System.out.println("Enter marks of java: ");
		java = sc.nextInt();
		System.out.println("Enter marks of DBMS: ");
		dbms = sc.nextInt();
    }
	void display2(){
	}
}

class C extends B
{
	void display1() //override
	{
		System.out.println(" Name is: "+a);
		System.out.println("Roll is:"+b);
	}
	void display2()
	
	{
	System.out.println("Java marks: " +java);
	System.out.println("DbMS marks:" +dbms);
	}
}

class multilevel_inh
{
	public static void main(String args[])
	{
		C obj  = new C();
		obj.show1();
		obj.show2();
		obj.display1();
		obj.display2();
		
	}
}

