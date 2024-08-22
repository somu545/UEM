import java.util.Scanner;
class A
{
	 int i,m,n;
	 String name;
	void set_data()
	{
	 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Number of students :");
	  n=sc.nextInt();
	
	  for(i=0;i<n;i++)
	  {
		System.out.println("\n Enter the name: ");
	    name=sc.nextLine();
		
		System.out.println("\n Enter the marks: ");
		m=sc.nextInt();
	  }
	}

void display()
{

	    if(m<50)
		  System.out.println("Fair");
		else if(m>=50 && m<75)
		  System.out.println("Good");
	    else if(m>=75 && m<85)
          System.out.print("Very Good");
	    else if(m>=85)
          System.out.print("Excellent");
}
}
class test29
{
	public static void main(String args[])
	{
		A obj =new A();
		obj.set_data();
		obj.display();
	}
}
	