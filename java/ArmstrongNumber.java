import java.util.*;
class A{
	int number,n,r,sum = 0;
	Scanner sc = new Scanner(System.in);
	void get_input()
	{
		System.out.println("Enter number: ");
		number = sc.nextInt();
		 n = number;
		while(number != 0)
		{
			r = number % 10;
			sum += Math.pow(r,3);
			number = number/10;
		}
		if(sum == n)
		{
			System.out.println(n +" is an Armstrong number");
		}
		else
		{
			System.out.println(n +" is not Armstrong");
		}
	}
}
class ArmstrongNumber
{
    public static void main(String[] args) {
		A obj = new A();
		obj.get_input();

    }
}