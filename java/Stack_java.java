import java.io.*;
class stack
{
	private int[] x;
	private int top;
	public stack()
	{
		top = -1;
		x = new int[5];
	}
	public stack(int n)
	{
		top = -1;
		x = new int [n];
	}
	public void push(int a)
	{
		try{
		top++;
		x[top] = a;
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Stack is full");
	}
    }
	public int pop()
	{
		int q = 0;
		try{
		q = x[top];
		top --;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("stack is empty");
		}
		return(q);
	}
	public void display()
	{
		try{
		System.out.println("List: ");
		for(int i=top;i>=0;i--)
		{
			System.out.println(x[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Interrupted");
		}

	}	
}

class Stack_java
{
	public static void main(String args[])throws IOException
	{
		BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the stack size: ");
		int m = Integer.parseInt(ds.readLine());
		stack s = new stack(m);
		int ch = 0;
		do
		{
			System.out.println(" 1.PUSH");
			System.out.println(" 2.POP");
			System.out.println(" 3.EXIT");
			System.out.println("------------------");
			System.out.println("Enter your choice(1/2/3)");
			ch = Integer.parseInt(ds.readLine());
			System.out.println("-----------------");
			switch(ch)
			{
				case 1:
				System.out.println("Enter data: ");
				int d = Integer.parseInt(ds.readLine());
				s.push(d);
				s.display();
				break;
				case 2:
				d = s.pop();
				System.out.println("Popped element= "+d);
				s.display();
				break;
			}
		}
		while(ch!=3);
	}
}
			
		

		