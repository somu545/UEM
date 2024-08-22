import java.util.Scanner;
class m1
{
	Scanner sc = new Scanner(System.in);
	int amount=0,ac;
	void input()
	{
	System.out.println("----SBI Bank-----");
	System.out.println("Enter name: ");
	String name = sc.nextLine();
	System.out.println("Enter AC no : ");
	ac = sc.nextInt();
	System.out.println("Enter Amount: ");
	amount=sc.nextInt();
	
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
	int a,amount2=0;
	public void axisbank()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Axis Bank-----");
		System.out.println("Enter name: ");
		String nm = sc.nextLine();
		System.out.println("Enter AC no : ");
		int no = sc.nextInt();
		System.out.println("Enter amount : ");
		amount2=sc.nextInt();
		
		System.out.println("Name : " +nm);
		System.out.println("Ac no : "+no);
		System.out.println("Amount: " +amount2);
	}
	void cal()
	{
		System.out.println("Enter amount for transaction: ");
		a = sc.nextInt();
		if(amount > a)
		{
			amount=(amount-a);
			amount2=(amount2+a);
		System.out.println("--Transaction Successful---");
		System.out.println("After transaction-- " +amount+ " in SBI Bank ac");
		System.out.println("After transaction-- " +amount2+ " in AXIS Bank ac");
		
		}
		else
		{
			System.out.println("Insufficiant Balance !!");
		}
		
	}
}

class bank_payment_multiple_inheritance
{
	public static void main(String args[])
	{
		paytm obj = new paytm();
		obj.input();
		obj.axisbank();
		obj.cal();
	}
}