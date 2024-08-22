import java.util.Scanner;
class Check_leapYear

{
		Scanner sc =new Scanner(System.in);
		int year;
		void get_input()
		{
			System.out.println("Enter a year: ");
			year=sc.nextInt();
			if((year%4==0) && (year%100==0) && (year%400==0))
			{
				System.out.println(year+"This is leap year");
			}
			else
			{
				System.out.println(year+"This is Not leap year");
			}
		}
}
class LeapYear
{
	public static void main(String args[])
	{
		CheckleapYear obj = new checkleapYear();
		obj.get_input();
	}
}