package p1;
import java.util.Scanner;
public class Bank
{
	public float amount,year;
	public Scanner sc = new Scanner(System.in);
	public void get_input()
	{
	
		System.out.println("Enter your amount: ");
		amount=sc.nextFloat();

		System.out.println("Enter Year: ");
		year=sc.nextFloat();
	
		
	}
}