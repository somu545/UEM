//differenrt package subclass

package p2;
import p1.Bank;
class Customer extends Bank
{
	float interest,rate;
	void display()
	{
		System.out.println("Enter rate: ");
		rate=sc.nextFloat();
		interest=(amount*year*rate)/100;
		System.out.println("Your interest is: "+interest);
	}
}

class Interest
{
	public static void main(String args[])
	{
		Customer obj = new Customer();
		obj.get_input();
		obj.display();
	}
}