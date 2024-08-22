
 import java.util.Scanner;
 abstract class temp1  //abstract class
 {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	
	void show1()
	{
		System.out.println("Enter the value of A");
		a = sc.nextInt();
		System.out.println("Enter the value of B");
		b = sc.nextInt();
	}
	abstract void display1();
	
}

class temp2 extends temp1
{
	void show2()
	{
		c=a+b;
	}
    void display1() //override
	{
		System.out.println("Sum is: "+c);
	}
}
class sum1
{
	public static void main(String args[])
	{
		temp2 obj = new temp2();
		obj.show1();
		obj.show2();
		obj.display1();
		
	}
}

