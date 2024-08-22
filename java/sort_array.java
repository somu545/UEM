import java.util.Scanner;

class A
{
	int array[],i,j,size,a;
	Scanner sc= new Scanner(System.in);
	void get_input()
	{
		System.out.println("Enter size of the array :");
		size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements in array : ");
		for(i=0;i<size;i++)
		array[i]=sc.nextInt();
		
		// sorting 
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					a=array[i];
					array[i]=array[j];
					array[j]=a;
				}
			}
		}
		System.out.println("Sorted list");
		for(i=0;i<size;i++)
		System.out.println(array[i]);
	}
}
class sort_array
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.get_input();
	}
}
		