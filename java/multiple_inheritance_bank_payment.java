import java.util.Scanner;
class m1
{
	Scanner sc = new Scanner(System.in);
	int amount;
	int ac;
	void input()
	{
	System.out.println("---SBI Bank----");
	System.out.println("Enter name: ");
	String name = sc.nextLine();
	System.out.println("Enter AC no : ");
	ac = sc.nextInt();
	System.out.println("Enter Amount: ");
	amount =sc.nextInt();
	
	System.out.println("Name : " +name);
	System.out.println("Ac no : "+ac);
	System.out.println("Amount: " +amount);
	
	}
}

interface m2
{
	void axisbank();
}

class paytm extends m1 implements m2
{
	int a,amount2,send,receive;
	public void axisbank()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("----Axis Bank----");
		System.out.println("Enter name: ");
		String nm = sc.nextLine();
		System.out.println("Enter AC no : ");
		int no = sc.nextInt();
		System.out.println("Enter Amount: ");
		amount2 =sc.nextInt();
		
		System.out.println("Name : " +nm);
		System.out.println("Ac no : "+no);
		System.out.println("Amount: " +amount2);
	}
	void show()
	{
		System.out.println("Enter amount for transaction: ");
		a = sc.nextInt();
	}
	void cal()
	{
		send = (amount-a);
		receive=(amount2+a);
		System.out.println("After transaction---" +send+ "in your ac");
		System.out.println("After transaction---" +receive+ "in Other ac");
		
	}
}

class multiple_inheritance_bank_payment
{
	public static void main(String args[])
	{
		m1 obj1 = new m1();
		obj1.input();
		paytm obj = new paytm();
		obj.axisbank();
		obj.show();
		obj.cal();
	}
}