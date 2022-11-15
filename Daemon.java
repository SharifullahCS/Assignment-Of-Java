package AdvancedJava;

//Java program to demonstrate the usage of
//setDaemon() and isDaemon() method.

public class Daemon extends Thread {

	public Daemon(String name){
		super(name);
	}

	public void run()
	{
		// Checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName() + " is Daemon thread");
		}
		
		else
		{
			System.out.println(getName() + " is User thread");
		}
	}

	public static void main(String[] args)
	{
	
		Daemon t1 = new Daemon("t1");
		Daemon t2 = new Daemon("t2");
		Daemon t3 = new Daemon("t3");
	
		// Setting user thread t1 to Daemon
		t1.setDaemon(true);
			
		// starting first 2 threads
		t1.start();
		t2.start();

		// Setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();		
	}
}

