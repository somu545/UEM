import java.util.Scanner;

class A
{
	Scanner sc =new Scanner(System.in);
	int num;
	void set_data()
	{
		System.out.println("Enter an intger: ");
		num= sc.nextInt();
	}
}
		
			
class B extends A
{
void positive_negative()
{
 if(num>0)
	 
 System.out.println("Entered integer is Positive");

 else 
	 
 System.out.println("Entered integer is Negative");
}
}

 
 
 class C extends A
 {
 void even_odd()
 {
  if(num %2==0)
  System.out.println("Entered integer is Even");
else
 System.out.println("Entered integer is Odd");
  }
 }
  
  class q10
  {
	  
  public static void main(String[]args)
  {
  B obj= new B();  
  C obj2 =new C();
  obj.set_data();
  obj.positive_negative();
  obj2.even_odd();
  }
  }
 

 

  
