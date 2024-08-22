import java.util.Scanner;

class A
{
  Scanner sc = new Scanner(System.in);
  float w,l,a;
  void set_data()
  {
  System.out.println("Enter Length: ");
  a=sc.nextFloat();
  
  }
  }
  
  
 class B extends  A
  {
  void cal()
  {
  System.out.println("Enter width: ");
  w =sc.nextFloat();
  }
 void display()
 {
	  a = w * l;
	 System.out.println("Area of Rectangle is:  "+a);
  }
  }
  
  
  class rectangle
  {
  public static void main(String args[])
  {
  B obj = new B();
  obj.set_data();
  obj.cal();
  obj.display();
  }
  }
  
  
