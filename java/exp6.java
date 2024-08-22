class InvalidNumException extends Exception{
InvalidNumException(String s){
	super(s);
 }
}

class exp6
{
	static void CheckNegative(int n)throws InvalidNumException{
	if(n < 0)
		throw new InvalidNumException("Student code is invalid");
		else
		System.out.println("Done !");
	}
public static void main(String args[])
{
	try
	{
	CheckNegative(-23);
	}
	catch(Exception e)
	{
		System.out.println(" Exception" +e);
	}
	System.out.println("After exception...");
	}
}
