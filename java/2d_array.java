import java.util.Scanner
class A
{
	Scanner sc = new Scanner(System.in);
	void get_array(int array[][])
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a==b)
				{
					if(array[m][n]% 2 == 0)
					c++;
				}
			}
		}
	}
	void display()
	{
		System.out.println("The no of even number: "+c):
	}
}

class Twod_array
{
	public static void main(String args[])
	{
		int m,n,i,j;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of rows: ");   
        m = sc.nextInt();
		System.out.print("Enter the number of columns: ");   
        n = sc.nextInt(); 
		int array[][] = new int[m][n];
		System.out.println("Enter the elements of the array: ");    
		for (i = 0; i < m; i++)   
		{
			for (j = 0; j < n; j++)  
			{
			array[i][j] = sc.nextInt();  
			}
		}
		 A obj =new A();
		obj.get_array(array);
		obj.display();
	}
}

