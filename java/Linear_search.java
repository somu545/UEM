// Linear search

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
	public void get_input()
	{
			try
			{
				BufferedReader db = new BufferedReader(new InputStreamReader(System.in));
				for(int i=0 ;i<x.length;i++)
				{
					System.out.println("x["+i+"]=" );
					x[i] = Integer.parseInt(db.readLine());
				}
				BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("What to find ? ");
				int d = Integer.parseInt(dd.readLine());
				boolean flag = false;
				for(int i=0 ; i<x.length; i++)
				{
					if(x[i] == d)
					{
						System.out.println("position: "+i);
						flag = true;
						break;
					}
				}
				if(flag == false)
				{
					System.out.println("not found");
				}
			}
			catch(IOException e)
			{
				System.out.println("input error"+e.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("Over flow"+e1.getMessage());
			}
	}
}

class Linear_search
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array size: ");
		int s = Integer.parseInt(ds.readLine());
		arr a = new arr(s);
		a.get_input();
		
	}
}