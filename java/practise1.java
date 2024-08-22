import java.util.*;
class a
{
	String name;
	int n1;
	a(String s,int n)
	{
		name = s;
		n1 = n;
	}
}
class b extends a
{
	String s1;
	int m1;
	b(String s1,int m1)
	{
		super(s1,m1);
		System.out.println(name+" "+n1);
	}

}

class practise1
{	
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter id: ");
		int n = sc.nextInt();
		
		b obj  = new b(name,n);
	}
}
		
		