import java.util.Scanner;

class A
{
	Scanner sc= new Scanner(System.in);
	int roll;
	String name;
	void set_data()
	{
	System.out.println("Enter your Name");
	name=sc.next();
	System.out.println("Enter your Roll");
	roll=sc.nextInt();
	}
}

class B extends A
{
  int java,dbms,math;
  void marks()
  {
  System.out.println("Enter marks of Java: ");
  java=sc.nextInt();
  System.out.println("Enter marks of dbms: ");
  dbms=sc.nextInt();
  System.out.println("Enter marks of math: ");
  math=sc.nextInt();
  }
  }
  
 class C extends B
 {
 int average=0;
 void show_data()
 {
 average=(java+dbms+math)/3;
 }
 void display()
 {
 System.out.println("Average is: " +average);
 System.out.println(name);
 System.out.println(roll);
 }
 }
 
 class average
 {
 public static void main(String[]args)

 {
	B obj = new B();
	C obj2 =new C();
	obj.set_data();
	obj.marks();
	obj2.show_data();
	obj2.display();
	}
	}
	
	
 
 
 
 
 
  
	
	