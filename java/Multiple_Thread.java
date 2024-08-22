class hii extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hii");
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				System.out.println("thread1 interrupted");
			}
		}
	}
}

class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				System.out.println("thread2 interrupted");
			}
		}
	}
}

class Multiple_Thread
{
	public static void main(String args[])
	{
		hii obj1 = new hii();
		hello obj2 = new hello();
		
		obj1.start();
		try{
			Thread.sleep(10);
		}catch(InterruptedException e)
		{
			System.out.println("interrupted");
		
		}
		obj2.start();
	}
}
		