import java.util.Scanner;
class get_digit
{
	int n,c,sum=0;
	Scanner sc = new Scanner(System.in);
	void cal()
	{
		System.out.println("Enter the numbers: ");
		n=sc.nextInt();
		while(n>0)
		{
			c=n%10;
			sum=sum+c;
			n=n/10;
		}
		System.out.println("Sum of digits:"+sum);
	}
}

class sumofDigit
{
	public static void main(String args[])
	{
		get_digit obj = new get_digit();
		obj.cal();
	}
}