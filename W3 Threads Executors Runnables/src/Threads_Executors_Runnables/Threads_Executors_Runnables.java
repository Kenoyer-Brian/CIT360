package Threads_Executors_Runnables;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 09, 2020
*/
/// Import Block
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
/// End Import Block

/**The Threads_Executors_Runnables Class
* @param none
* @returns none
*/
public class Threads_Executors_Runnables{
	
	// Sets the max number of threads for the thread pool
	static final int THREADS_MAX = 2;
	
	/**The main() Method
	 * @param none
	 * @returns none
	 */
	public static void main(String[] args) {
		
		// Prints out the initial terminal test prompt
		System.out.println("Initial Manual test start of threads: ");
		
		// Creation of a new object (called thread1) for the Thread_Task_One class
		Thread thread1 = new Thread(new Thread_Task_One ());
		
		//Call to the run method within the Thread_One Class through the object thread1
		thread1.start();
		
		// Creation of a new object (called thread2) for the Thread_Task_Two class
		Thread_Task_Two threadextends = new Thread_Task_Two();
		
		//Call to the run method within the Thread_One Class through the object thread2
		threadextends.start();
				
		// Creates the threadpool object
	    ExecutorService pool = Executors.newFixedThreadPool(THREADS_MAX); 
	    
		// Prints the end of the calls to the manual tests.
		System.out.println("End Initial Manual test start of threads: ");
	    
		// Creation of the object thread2
		Thread thread2 = new Thread(new Thread_Task_One ());
		
		// Creation of the object thread3
		Thread thread3 = new Thread(new Thread_Task_One ());
		
		// Creation of the object thread4
		Thread thread4 = new Thread(new Thread_Task_One ());
		
		// Creation of the object thread5
		Thread thread5 = new Thread(new Thread_Task_One ());
		
		// Creation of the object thread6
		Thread thread6 = new Thread(new Thread_Task_One ());
		
		// Executes thread1 through the threadpool
		pool.execute(thread1);
		
		// Executes thread2 through the threadpool
		pool.execute(thread2);
		
		// Executes thread3 through the threadpool
		pool.execute(thread3);
		
		// Executes thread4 through the threadpool
		pool.execute(thread4);
		
		// Executes thread5 through the threadpool
		pool.execute(thread5);
		
		// Executes thread6 through the threadpool
		pool.execute(thread6);
		
		// Shutsdown the threadpool after completion
		pool.shutdown(); 
		
		
	}/// End of main()
	
}/// End Threads_Executors_Runnables


/**The Thread_One class
 * Purpose: Runs one thread as a Runnable
 * @param  none
 * @returns none
 */
class Thread_Task_One implements Runnable {

	
	/**The run() Method
	 * @param none
	 * @returns none
	 */
	public void run() {
		
		//Try logic
		try {
			
			//For loop to test the threading setup
			for (int index=0; index <=5; index++){
				
				// if logic to test for the first call on the loop
				if (index == 0) {
				
					//Print out to show iteration of the loop
					System.out.println("First Test " + index);
				
				}/// End if Statement
				
				// Else logic to handle all other iterations of the loop
				else {
					
					//Print out to show iteration of the loop
					System.out.println("Test " + index);
					
				}/// End else statement
				
				// Sleeps the threads for 1sec
				Thread.sleep(1000);
				
			}///End of for loop
			
			// Prints out the finish of a loop iteration
			System.out.println("Done ");
			
		}/// End Try Statement
		
		// Catch portion of try block
		catch(Exception e) {
			
			//helps to trace exceptions
            e.printStackTrace(); 
			
		}/// End catch()
		
	}/// End Run()

	
	
}/// End of Thread_One

/**The Thread_Two class
 * Purpose: Runs the second thread as an extension of Thread
 * @param  none
 * @returns none
 */
class Thread_Task_Two extends Thread {

	/**The run() Method
	 * @param none
	 * @returns none
	 */
	public void run() {
		
		// Prints out to show that thread 2 runs.
		System.out.println("Thread_Two Class running showing Extend of thread");
		
	}/// End Run()	
	
}/// End of Thread_Two
