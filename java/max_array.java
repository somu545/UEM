import java.util.Scanner;
class A
{
	int size,i,max,array[],min;
	Scanner sc= new Scanner(System.in);
	void get_data()
	{
		System.out.println("Enter the size of the Array: ");
		size=sc.nextInt();
		int array[]=new int [size];
		System.out.println("Enter the Elements in array: ");
		for(i=0;i<size;i++)
		array[i]=sc.nextInt();
	
		max=array[0];
		min=array[0];
		for(i=0;i<size;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			else if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("Max is"+max);
		System.out.println("Min is"+min);		
	}
}
class max_array
{
	public static void main(String args[])
	{
		A obj= new A();
		obj.get_data();
	}
}