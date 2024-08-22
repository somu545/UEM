import java.io.*;
class arr
{
	private int[] x;
	public arr()
	{
		x = new int[5];
	}
	public arr(int n)
	{
		x = new int[n];
	}
	public void read()
	{
		while(true)
		{
			try{
			BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0 ;i<x.length;i++)
			{
				System.out.println("x["+i+"]=" );
				x[i] = Integer.parseInt(dd.readLine());
			}
			break;
		}catch(IOException e)
		{
			System.out.println("Input error"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Over flow"+e1.getMessage());
		}
		catch(NumberFormatException e2)
		{	
			System.out.println("invalid format");
		}
		finally
		{
			System.out.println("Thank you");
		}
		}
	}
public void display()
{
	
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i] );
	}
}

public void quicksort(int first,int last)
{
	
	int i,j,t,pivot,temp;
	if(first > last)
	{
		pivot = first;
		i = first;
		j = last;
	}
	while(i < j)
	{
		while (x[i]<=x[pivot] && i<last)
			i++;
		while(x[j] > x[pivot])
			j--;
		if(i < j)
		{
			temp = x[i];
			x[i]=  x[j];
			x[j] =temp;
		}
	}
	temp =x[pivot];
	x[pivot] = x[j];
	x[j] = temp;
	quicksort(first,j-1);
	quicksort(j+1,last);
			
	}
}
class Array_BubbleSort
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many no: ");
		int m =Integer.parseInt(ds.readLine());
		
		arr t = new arr(m);
		t.read();
		t.quicksort(0,m-1);
		t.display();
	}
}