import java.util.Scanner;
class InvalidNumberException extends Exception
{
	InvalidNumberException(String s)
	{
		super(s);
	}
}
class error_genarated
{
	int num;
	Scanner sc = new Scanner(System.in);
	void valid_number() throws InvalidNumberException
	{
		System.out.print("\n Enter the number : ");
		num=sc.nextInt();
		if(num<0)
		{
			throw new InvalidNumberException("Negetive number");
		}
		else
		{
			System.out.print("\n The number is : "+num);
		}
	}
	
}

class throws_exception2
{
	
	public static void main(String args[])
	{
		try
		{
			error_genarated obj = new error_genarated();
			obj.valid_number();
		}
		catch(Exception e)
		{
			System.out.print("\n this number is negetive number "+e);
		}
		
	}
}
	
