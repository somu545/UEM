import java.util.Scanner;
class A{
	void call() 
	{
		System.out.print("[");
		try {
		Thread.sleep(1000);
		} catch(InterruptedException e) {
		System.out.println("Interrupted");
		}
	System.out.println("]");
	}
}
class Caller implements Runnable {
	Scanner sc = new Scanner(System.in);
	int n;
	Thread t;
	public Caller() {
	t = new Thread(this);
	t.start();
}
public void run() 
	{
	System.out.println("Enter no: ");
	n = sc.nextInt();
	try{
	if( n %2 == 0)
	{
		
		System.out.println(n+" Even");
	} 
	else
	{
		System.out.println(n+" Odd");
	}
	}catch(InterruptedException e)
	{
		System.out.println("interrupted");
	}
}
}
class Synch_Even_Odd
{
	public static void main(String args[])
	{
		A target = new A();
		Caller ob1 = new Caller();
		Caller ob2 = new Caller();
		try {
		ob1.t.join();
		ob2.t.join();
		
		} catch(InterruptedException e) {
		System.out.println("Interrupted");
		} 
	} 
}