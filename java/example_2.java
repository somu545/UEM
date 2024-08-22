import java.util.Scanner;

class A
{
	int size,search,f=1,array[],c=o;
	void getArray()
	{
	  System.out.print("\nEnter the size of the array: ");
		size = sc.nextInt();
		array = new int[size];
	}
	void Input(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value into the array: ");
	for(i=0;i<size;i++)
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
	public void callback()
	{
		System.out.println("Enter the value to search: ");
		search=sc.nextInt();
	
		for(i=0;i<size;i++)
		{
			if(array[i] == search)
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


class example_2
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.getArray();
		obj.Input();
		obj.callback();
		obj.show();
	}
}

	