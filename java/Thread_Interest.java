import java.util.Scanner;
class Thread_Interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int amount,fine;
	
			System.out.println("Enter the amount: ");
			amount = sc.nextInt();
			try{
				if(amount >= 2000)
				{
					amount = amount+(amount *  5)/100;
					System.out.println("Your new Amount after interest: "+amount);
				}
				else
				{
					Thread.sleep(2000);
					fine = amount -250;
					System.out.println("Your new Amount after fine: "+fine);
				}
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupted");
			}
	}

}