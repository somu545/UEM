import java.util.Scanner;
class AmountInterest extends Exception
{
	AmountInterest(String s)
	{
		super(s);
	}
}
	
class Interest_amount 
{
	Scanner sc = new Scanner(System.in);
	int amount,interest,fine;
		
		void get_input() throws AmountInterest
		{
			try
			{
				System.out.println("Enter the amount: ");
				amount = sc.nextInt();
					if(amount < 0)
					{
						throw new AmountInterest("Error !Negative Number");
					}
					else if(amount >=2000)
					{
						interest = (amount *  5)/100;
						System.out.println("Your new Amount after interest: "+interest);
					}
					else
					{
						Thread.sleep(5000);
						fine = amount -250;
						System.out.println("Your new Amount after fine: "+fine);
					}
			}
			catch(InterruptedExcetion e)
			{
				System.out.print("Main thread interrupted "+e);
			}
		}
}
class Exception_Userdefined_Interest
{
	public static void main(String args[])
	{	
		try{
				
			Interest_amount obj = new Interest_amount();
			obj.get_input();
		}
		catch(Exception e)
			{
				System.out.println("interrupted"+e);
			}
	}

}