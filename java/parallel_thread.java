class hi extends Thread
{
	public void run()
	{
		for(int i=1; i<=10 ;i++)
		{
			System.out.println("hi");
			
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e){
			System.out.println("hi Interrupteed");
			}
		}
	}
}

class hello extends Thread
{
	public void run()
	{	
		for(int i=1; i<=10; i++)
		{
			System.out.println("hello");
			
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e){
			System.out.println(" helllo Interrupteed");
			}
		}
	}
}

class parallel_thread
{
	public static void main(String args[])
	{
		hi obj1 = new hi();
		hello obj2 = new hello();
		
		obj1.start();
		obj2.start();
		
	}
}