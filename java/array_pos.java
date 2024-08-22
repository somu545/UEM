import java.util.Scanner;
class Array
{
		int i,x,f=1,c=0,size;
		Scanner sc =new Scanner(System.in);
		void search_Array(int [] array)
		{
			System.out.println("Enter the value to search:");
			x=sc.nextInt();
			for(i=0;i<array.length;i++)
			{
				if(array[i]==x)
				{
					f=0;
					c++;
				}
			}
			
		}

		void display()
		{
			if(f==1)
			{
				System.out.println("Not present");
			}
			else
			{
				System.out.println("present " +c+ " times");
			}
		}
}
class array_pos
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size =sc.nextInt();
		int[]array=new int[size];
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		Array obj =new Array();
		obj.search_Array(array);
		obj.display();
	}
}
		
		