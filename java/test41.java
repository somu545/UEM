package p2;
import p1.Bank;
class Customer2
{
	float interest;
	void display()
	{
		Customer obj1 = new Customer();
		interest=(a*year)/100;
		System.out.println("Your interest is: "+obj1.interest);
	}
}

class Interest2
{
	public static void main(String args[])
	{
		Customer2 obj = new Customer2();
		obj.display();
	}
}