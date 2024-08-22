
import java.util.Scanner;
class cal
{
	int opp1,opp2,sum=0;
	void get_input()
	{
		Scanner sc = new Scanner(Sytem.in);
		System.out.println("Enter value of opp1: ");
		opp1=sc.nextInt();
		System.out.println("Enter value of opp2: ");
		opp2=sc.nextInt();
	}
	void Add()
	{
		sum=opp1+opp2;
		System.out.println("Addition =: "+sum);
	}
	void Subtract()
	{
		sum=opp1-opp2;
		System.out.println("Subtraction=: "+sum);
	}
	void Multiply()
	{
		sum=opp1*opp2;
		System.out.println("Multiplication =: "+sum);
	}
	void Divide()
	{
		sum=opp1/opp2;
		System.out.println("Division =: "+sum);
	}
}

class session4_as3
{
	public static void main(String args[])
	{
		class cal obj= new cal();
		obj.Add();
		obj.Subtract();
		obj.Multiply();
		obj.Divide();
	}
}
		