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
 {
 system.out.println("Entered integer is Positive");
 }
 else 
 {
	 System.out.println("Entered integer is Negative);
 }
 class C extends B
 {
 void even_odd()
 {
  if(num %2==0)
  System.out.println("Entered integer is Even");
else
 System.out.println("Entered integer is Odd");
  }
  
  class q10
  {
  public static void main(String[]args)
  {
  c obj =new c();
  obj.set_data();
  obj.set_data2();
  obj.set_data3();
  }
  }
 

 

  
