import java.util.Scanner;
	class A{
		Scanner sc=new Scanner(System.in);
		int x,y,z,p,sum=0;
			void get_input()
				{
				System.out.println("Enter the value of x,y,z,p:");
				x=sc.nextInt();
				y=sc.nextInt();
				z=sc.nextInt();
				p=sc.nextInt();
				}
			}
			
class B extends A{
		void cal()
			{
				try 
				{ 
				sum=(x+y+z)/p;
				System.out.println("TRY-->sum is :"+sum);
				} catch (ArithmeticException e)
				{ 
					System.out.println(" Errorr!! Division by zero");
				}
				
			}
}
	
				
		class exc3
		{
		public static void main(String args[])
			{
			B obj=new B();
			obj.get_input();
			obj.cal();
			}
		}