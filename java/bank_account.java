import java.util.Scanner;
class account
{
	
	Scanner sc = new Scanner(System.in);
	String ahname;
	int acno,balance;
	account()
	{
		ahname = "";
		acno = 0;
		balance = 0;	
	}
	account(int s2,String s1,int s3)
	{
		ahname = s1;
		acno = s2;
		balance = s3;
	}
	void read_account()
	{
		System.out.println("Enter Account no: ");
		acno = sc.nextInt();
		System.out.println("Enter Name: ");
		ahname = sc.next();
		System.out.println("Enter Balance: ");
		balance = sc.nextInt();
	
	}
	void disp_account()
	{
		System.out.println("Account no:  "+acno);
		System.out.println("Name:  "+ahname);
		System.out.println("Balance:  "+balance);
	}
}

	
class bank_account
{
	public static void main(String args[])
	{
		account obj = new account(200231,"Somnath Singharoy",40000);
		obj.disp_account();
		
		account obj1 = new account();
		obj1.read_account();
		obj1.disp_account();

	}
}