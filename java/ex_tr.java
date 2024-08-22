import java.util.Scanner;
class user_exception extends Exception
{
	user_exception(String s)
	{
		super(s);
	}
}
class user
{
	int amnt;
	double interest,fine,total;
	Scanner sc = new Scanner(System.in);
	void get_data() throws user_exception
	{
		try
		{
			System.out.print("\n Enter the amount : ");
			amnt = sc.nextInt();
			System.out.print("\n Amount : "+amnt+"\n");
			if(amnt < 0)
			{
				throw new user_exception("Balance is Negetive");
			}
			if(amnt>=2000)
			{
				interest = (amnt*5)/100;
				total = interest + amnt;
				 Thread.sleep(5000);
				System.out.print("\n Interest of "+amnt+" : "+interest);
				System.out.print("\n Total amount with 5% : "+total);
			}
			if(amnt<2000)
			{
				fine = 250;
				total = amnt - fine;
				Thread.sleep(5000);
				System.out.print("\n Fine of "+amnt+" : "+fine);
				System.out.print("\n Total amount with fine : "+total);
			}
		}
		catch(InterruptedException e)
		{
			System.out.print("Main thread interrupted "+e);
		}
	}
}
class ex_tr
{
	public static void main(String args[])
	{
		try
		{
			user obj = new user();
			obj.get_data();
		}
		catch(Exception e)
		{
			System.out.print("Error... "+e);
		}
	}
	
}