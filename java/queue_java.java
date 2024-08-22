
import java.io.*;
class queue
{
	private int[] x;
	private int rear;
	private int front;
	public queue(int n)
	{
		x = new int[n];
	}
	void push(int d)
	{
		if(rear == x.length-1)
		{
			System.out.println("Queue is Full");
			return;
		}
		if(front == -1)
		{
			front = 0;
		}
		rear++;
		x[rear] = d;
		return;
	}
	int pop()
	{
		int m;
		if(front == -1)
		{
			System.out.println("Queue is empty");
			return (0);
		}
		m = x[front];
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else
		{
			front++;
		}
		return(m);
	}
	void display()
	{
		int i;
		if(front!=1)
		{
			System.out.println("front = "+front+" Rear = "+rear);
			for(i=front;i<=rear;i++)
			{
				System.out.println(x[i]);
			}
		}
		return;
	}
}
class queue_java
	{
		public static void main(String args[])throws IOException
		{
			int front=-1;
			int rear=-1;
			BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Queue size: ");
			int size = Integer.parseInt(ds.readLine());
			queue s = new queue(size);
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
				int x = Integer.parseInt(ds.readLine());
				s.push(x);
				s.display();
				break;
				case 2:
				x = s.pop();
				System.out.println("Popped element= "+x);
				s.display();
				break;
			}
		}while(ch!=3);
	}
}