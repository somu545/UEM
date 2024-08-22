package p1;
import java.util.Scanner;
public class Bank
{
	public int a,year;
	public Scanner sc = new Scanner(System.in);
	public void get_input()
	{
	
		System.out.println("Enter your amount: ");
		a=sc.nextInt();
		System.out.println("Enter Year: ");
		year=sc.nextInt();
		
	}
}