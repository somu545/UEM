import java.util.Scanner;

class A
{
  int array[]= new int[10];
	int i,a,f=1;
	void Input(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value into the array: ");
	for(i=0;i<10;i++)
	{
		array[i]=sc.nextInt();
	}
}

interface B 
{
	void callback();
}

class C extends A implements B
{
	int x,c=0;
	public void callback()
	{
		System.out.println("Enter the value to search: ");
		x=sc.nextInt();
	
		for(i=0;i<10;i++)
		{
			if(array[i] == x)
			{
				f=0;
				c++;
			}
		}
	}
	void show()
		{
		if(f==1)
		{
		System.out.println("Present"+c+ "times");
		}
		else
		{
		System.out.println("not Present");
		}
	  }
}


class CheckArray
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.Input();
		obj.callback();
		obj.show();
	}
}

	