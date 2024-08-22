import java.util.Scanner;
interface A 
      {    
		void get_base();
	
      }   
    
interface B     
   {    
	void get_power();
   }
  
 class C implements A,B
 {
	float a,b,sum;
	Scanner sc = new Scanner(System.in);
	public void get_base()
	{
	 System.out.println("Enter the value of Base: ");
	 a=sc.nextFloat();
	}
	public void get_power()
	{    
	 System.out.println("Enter the value of Power: ");
	 b=sc.nextFloat();	
    } 
	void cal()
	{
		sum=1;
		for(int i=0;i<b;i++)
		{
			sum=sum*a;
		}
	
		System.out.println("sum: "+sum);
    }
}
    
class power
  {    
     public static void main(String arg[])    
       {    
          C obj = new C(); 
			obj.get_base();
			obj.get_power();
			obj.cal();
        }    
  }
  
 