import java.util.Scanner;
interface a
{
	public void input();
}
interface b extends a
{
	public void cal1();
}
interface c extends a
{
	public void cal2();
}
class d implements b, c
{
	Scanner sc = new Scanner(System.in);
	float num, num1, i;
	int sum;
	public void input()
	{
		System.out.print("Enter the A: ");
		num = sc.nextFloat();
		System.out.print("Enter the B: ");
		num1 = sc.nextFloat();
	}
	public void cal1()
	{
		sum =(int) (num + num1);
	}
	public void cal2()
	{
		i = num / num1;
	}
	public void show()
	{
		System.out.println("the sum is = "+sum);
		if (num1 != 0)
			System.out.print("Dividation is successfull and answer is = "+i);
		else
			System.out.print("Dividation is unsuccessfull and answer is = "+i);
	}
}
class hybrid_inheritance_2
{
	public static void main(String args[])
	{
		d obj = new d();
		obj.input();
		obj.cal1();
		obj.cal2();
		obj.show();
	}
}