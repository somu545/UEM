class MyThread implements Runnable{
Thread obj;
	MyThread(){
	obj = new Thread(this,"even_odd");
	System.out.println("my thread: " +obj);
	obj.start();
	}
	
public void run(){
	int a,n=10;
	
	try{
      for(a = 1; a <= n; a++)
      {
         if(a % 2 == 0)
         {
            System.out.println(a);
			Thread.sleep(500);
         }
      }
      for(a = 1; a <= n; a++)
      {
         if(a % 2 != 0)
         {
            System.out.println(a);
			Thread.sleep(500);
		}
	}
	}catch(InterruptedException e){
	System.out.println("My thread interrupted ");
	}
	System.out.println("End of my thread");
}
}

class User_defined_thread{
public static void main(String args[])
{
	new MyThread();
	try{
	for(int i=1;i<=5;i++)
		{
		System.out.println("main thread: somnath");
		Thread.sleep(1000);
		}
	}catch(InterruptedException e){
	System.out.println("Main thread interrupted");
	}
	System.out.println("End of main thread");
	}
}
	