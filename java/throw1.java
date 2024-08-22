import java.util.Scanner;
class throw1
{
	static void get_id()
	{
		Scanner sc  = new Scanner(System.in);
		int arr[] = new int [10],x,i;
		System.out.println("Enter the size of the array: ");
		x=sc.nextInt();
		
		try{
			System.out.println("Enter the elements: ");
		for(i=0;i<x;i++)
		arr[i]=sc.nextInt();
		throw new ArrayIndexOutOfBoundsException("demo");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid size ");
			throw e;
		}
	}
	
public static void main(String args[])
{
	try{
	get_id();
	}catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Recaught,Array index out of bound !!");
	}
  }
}