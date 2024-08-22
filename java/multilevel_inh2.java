import java.util.Scanner;
abstract class a
{
	abstract void num();
}
class b extends a
{
	Scanner sc = new Scanner(System.in);
	String n, r;
	int j, cp;
	void num()
	{
		System.out.print("Enter your name - ");
		n = sc.nextLine();
		System.out.print("\nEnter your student code - ");
		r = sc.next();
	}
	void marks()
	{
		System.out.print("\nEnter your java marks - ");
		j = sc.nextInt();
		System.out.print("\nEnter your c program marks - ");
		cp = sc.nextInt();
	}
}
class c extends b
{
	void show()
	{
		System.out.print("\n\nYour name :- "+n);
		System.out.print("\nYour roll :- "+r);
		System.out.print("\nJava marks :- "+j);
		System.out.print("\nC program marks :- "+cp);
	}
}
class test17
{
	public static void main(String args[])
	{
		c obj = new c();
		obj.num();
		obj.marks();
		obj.show();
	}
}