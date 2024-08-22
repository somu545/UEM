import java.util.Scanner;
class AmountInterest extends Exception
{
	AmountInterest(String s)
	{
		super (s);
	}
}
	
class Interest_amount 
{
	Scanner sc = new Scanner(System.in);
		int amount,interest,fine;

		void get_input()throws AmountInterest
		{
			System.out.println("Enter the amount: ");
			amount = sc.nextInt();
			try{
				if(amount < 0)
				{
					throw new AmountInterest("Error !Negative Number");
				}
				else if(amount >=2000)
				{
					interest = (amount *  5)/100;
					interest += 500;
					System.out.println("Your new Amount after interest: "+interest);
				}
				else
				{
					Thread.sleep(2000);
					fine = amount -250;
					System.out.println("Your new Amount after fine: "+fine);
				}
			}
			catch(Exception e)
			{
				System.out.println("interrupted");
			}
		}
}
class UserDefined_Exception_Interest
{
	public static void main(String args[])
	{	
		Interest_amount obj = new Interest_amount();
		obj.get_input();
	}

}
		
			