import java.util.Scanner;

class A
{
  Scanner sc = new Scanner(System.in);
  int a,c;
  void show()
  {
  System.out.println("Enter Length: ");
  a=sc.nextInt();
  }
  }
  
  
 class B extends  A
  {
  void area()
  {
   c= a*a;
  }
 void display()
 {
	 System.out.println("area is: "+c);
  }
  }
  
  
  class inheritence_2
  {
  public static void main(String args[])
  {
  B obj =new B();
  obj.show();
  obj.cal();
  obj.display();
  }
  }
  
  
