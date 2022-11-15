package AdvancedJava;


class MultithreadingDemo extends Thread{
	public void run()
	{
		try{
			// Displaying the Tread.
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}
		
		catch(Exception e){
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
  // Main class.
public class Multihtreading {

	public static void main(String[] args) {
		
		int n =8; // Number of Threads.
		for(int i=0; i<n; i++){
			MultithreadingDemo obj = new MultithreadingDemo();
			obj.start();
		}

	}

}
