class NewThread extends Thread{
NewThread(){
	// create a new second thread
	super("Demo thread");
	System.out.println("Child thread:" +this);
	start();  //start the threa
}
//this is the entry point for the second thread
public void run(){
	try{
		for(int i = 5; i > 0 ; i--){
		System.out.println("Chlid thread: "+i);
		Thread.sleep(500);
		}
	}
	catch(InterruptedException e){
	System.out.println("Chlid interrupted");
	}
	System.out.println("Exit from child");
	}
}

class Thread_extend
{
	public static void main(String args[])
	{
		new NewThread(); //create a new thread
		try{
			for(int i = 5; i > 0; i--){
			System.out.println("Main thread: "+i);
			Thread.sleep(1000);
			}
		}catch(InterruptedException e){
		System.out.println("Main thread interrupted");
		}
		System.out.println("exit from main thread");
	}
}

		
		
