//differenrt package non subclass


package p2;
import p1.Bank;
class Customer2
{
	float interest,rate;
	void display()
	{
		Bank obj1 = new Bank();
		System.out.println("Enter rate: ");
		rate=obj1.sc.nextFloat();
		interest=(obj1.amount*obj1.year*rate)/100;
		System.out.println("Your interest is: "+interest);
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