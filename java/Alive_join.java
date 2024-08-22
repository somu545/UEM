
class NewThread implements Runnable {
	String name; 
	Thread t;
	NewThread(String threadname) {
	name = threadname;
	t = new Thread(this, name);
	System.out.println("New thread: " + t);
	t.start(); 
	}
	
public void run() {
	try {
	System.out.println(name + ":");
	Thread.sleep(1000);
	}
	catch (InterruptedException e) {
	System.out.println(name + " interrupted.");
	}
	System.out.println(name + " exiting.");
	} 
}

class Alive_join {
	public static void main(String args[]) {
	NewThread ob1 = new NewThread("One");
	NewThread ob2 = new NewThread("Two");
	NewThread ob3 = new NewThread("Three");
	NewThread ob4 = new NewThread("Four");
	
	System.out.println("Thread One is alive: "+ ob1.t.isAlive());
	System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
	System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
	System.out.println("Thread Four is alive: "+ ob4.t.isAlive());
	

		try {
		System.out.println("Waiting for threads to finish.");
		ob1.t.join();
		ob3.t.join();
		} catch (InterruptedException e) {
		System.out.println("Main thread Interrupted");
		} 
		System.out.println("Thread One is alive: "+ ob1.t.isAlive());
		System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
		System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
		System.out.println("Thread Four is alive: "+ ob4.t.isAlive());
		System.out.println("Main thread exiting.");
		} 
	}