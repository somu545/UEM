/*2)Accept student_name and marks from keyboard and display their performance
according to the following conditions:
MARKS      Performance
<50          Fair
>=50 and <75  Good
>=75 and <85  V.Good
>=85          Excellent */



import java.util.Scanner;
class A
{
	Scanner sc = new Scanner(System.in);
	String str;
	int m;
 void set_data()
 {
	System.out.println("Enter Name: ");
	str = sc.nextLine();
	System.out.println("Enter marks:");
	m=sc.nextInt();
	}
	void display()
	{
		if(m<50)
		System.out.println("Fail");
		else if(m>= 50 && m< 75)
		System.out.println("Good");
		else if(m>= 75 && m< 85)
		System.out.println("Very good");
		else if(m>=85)
		System.out.println("Excellent");
		else
		System.out.println("You are Fail");
	}
}
class as2_q2
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.set_data();
		obj.display();
	}
}
		
		
		
		
		
	