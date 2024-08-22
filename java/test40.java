package p2;
import p1.Bank;
class Customer extends Bank
{
	float interest;
	void display()
	{
		interest=(a*year)/100;
		System.out.println("Your interest is: "+interest);
	}
}

class test40
{
	public static void main(String args[])
	{
		Customer obj = new Customer();
		obj.display();
	}
}