import java.util.Scanner;
class lowercase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//problem 1
		/*String name ="SOM NATH";
		System.out.println(name.toLowerCase());
		//problem 2
		System.out.println(name.replace(" ","_"));
		
		//problem 3
		
		String letter= "Dear <|name|>,Thanks a lot";
		letter=letter.replace("<|name|>","Somu");
		System.out.println(letter);
		
		//problem 4 
		
		String Mystring="I got  new   books";
	    System.out.println(Mystring.indexOf("  "));
		System.out.println(Mystring.indexOf("   "));
		
		//problem 5

		int java,math,os;
		float avg;
		Scanner sc = new Scanner(System.in);
		java=sc.nextInt();
		Scanner sc = new Scanner(System.in);
		os=sc.nextInt();
		Scanner sc = new Scanner(System.in);
		math=sc.nextInt();
		
		float avg =(java+os+math)/3.0f;
		if(avg>40 && java>33 && math>33 && os>33){
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
			
		
		
		float tax=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income: ");
		float income=sc.nextFloat();
		if(income <= 2.5f)
		{
			tax=tax+0;
		}
		else if(income> 2.5f && income<=5f)
		{
			tax=tax+0.05f*(income-2.5f);
		}
		else if(income>5f && income<=10f)
		{
			tax=tax+0.05f*(5.0f-2.5f);
			tax=tax+0.2f*(income-5f);
		}
		else if(income >10f)
		{
			tax=tax+0.05f*(5f-2.5f);
			tax=tax+0.2f*(10f-5f);
			tax=tax+0.3f*(income-10f);
		}
		System.out.println("your Tax is:"+tax);
		
		
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Number upto 7: ");
			int day=sc.nextInt();
			switch(day)
			{
				case 1:
				{
					System.out.println("Monday");
					break;
				}
				case 2:{
					 System.out.println("Tuesday");
					 break;
				}
				case 3:{
					 System.out.println("Wednesday");
					 break;
				}
				case 4:{
					 System.out.println("Thirsday");
					 break;
				}
				case 5:{
					 System.out.println("Friday");
					 break;
				}
				case 6:{
					 System.out.println("saturday");
					 break;
				}
				case 7:{
					System.out.println("Sunday");
					break;
				}
			}
			
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Website: ");
		String website=sc.next();
		if(website.endsWith(".com"))
		{
			System.out.println("Commercial website");
		}
		else if(website.endsWith(".org"))
		{
			System.out.println("organisational website");
		}
		else if(website.endsWith(".in"))
		{
			System.out.println("Indian website");
		}
	
       //   continue 
		
		 int i;
		 for(i=0;i<5;i++)
	 {
		 if(i==2)
		 {
			continue;
		 }
		 System.out.println(i);
	 }
	 
		int i=0;
		do
		{
			i++;
			if(i==2)
			{
				continue;
			}
			System.out.println(i);
		}while(i<5);
		*/
		int n,i,j;
		System.out.println("Enter the no of rows: ");
		n=sc.nextInt();
		for(i=n;i>0;i++)
		{
			for(j=0;j<i;j++)
			System.out.println("*");
		}
		System.out.println();
	
	
	} 
	

}