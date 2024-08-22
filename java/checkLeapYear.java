import java.util.Scanner;
class A

{
		Scanner sc =new Scanner(System.in);
		int year;
		void get_input()
		{
			System.out.println("Enter a year: ");
			year=sc.nextInt();
			if((year%4==0) && (year%100!=0) || (year%400==0))
			{
				System.out.println(year+ " is leap year");
			}
			else
			{
				System.out.println(year+  " is Not leap year");
			}
		}
}
class checkLeapYear
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.get_input();
	}
}