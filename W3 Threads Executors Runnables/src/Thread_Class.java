
/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: January 22, 2020
*/

/**The Thread_One class
 * Purpose: Runs one thread that extends thread
 * @param  none
 * @returns none
 */
class Thread_One extends Thread{
	
	// Run Method for Thread_Two
	public void run(){
		
		//For loop to test the threading setup
		for(int index=1; index <=5; index++){
			
			//Print out to show iteration of the loop
			System.out.println("Test " + index);
			
			try { Thread.sleep(500); } catch(Exception e) {}
			
		}///End of for loop
		
	}/// End of run()
	
}/// End of Thread_One



/**The Thread_Two class
 * Purpose: Runs one thread that extends thread
 * @param  none
 * @returns none
 */
class Thread_Two extends Thread{
	
	// Run Method for Thread_Two
	public void run(){
		
		//For loop to test the threading setup
		for(int index=1; index <=5; index++){
			
			//Print out to show iteration of the loop
			System.out.println("Test$ " + index);
			
			try { Thread.sleep(500); } catch(Exception e) {}
			
		}///End of for loop
		
	}/// End of run()
	
}/// End of Thread_Two


/**The Thread_Two class
 * Purpose: Runs one thread that extends thread
 * @param  none
 * @returns none
 */
public class Thread_Class {

	/**The main() Method
	 * @param none
	 * @returns none
	 */
	public static void main(String[] args) {
		
		// Creation of a new object (called obj1) for the Thread_One class
		Thread_One obj1 = new Thread_One();
		
		// Creation of a new object (called obj2) for the Thread_Two class
		Thread_Two obj2 = new Thread_Two();
		
		//Call to the run method within the Thread_One Class through the object obj1
		obj1.start();
		
		//Call to the run method within the Thread_Two Class through the object obj2
		obj2.start();
		
		
	}/// End of main()
	
	
}/// End of Thread_Class
