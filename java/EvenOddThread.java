class EvenOddThread{
public static void main(String args[])
{
	int a,n=10;
	Thread t = Thread.currentThread();
	System.out.println("Current thread: "+t);
	t.setName("my thread");
	System.out.println("After name change: "+t);
	try{
		System.out.println("Even numbers: \n");
      for(a = 1; a <= n; a++)
      {
         if(a % 2 == 0)
         {
            System.out.println(a);
			Thread.sleep(1000);
         }
      }
      System.out.println("Odd numbers are: \n");
      for(a = 1; a <= n; a++)
      {
         if(a % 2 != 1)
         {
            System.out.println(a);
			Thread.sleep(1000);
		}
	}
	}catch(InterruptedException e){
	System.out.println("Main thread interrupted ! After catch");
	}
}
}