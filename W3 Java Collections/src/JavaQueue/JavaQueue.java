/**
 * 
 */
package JavaQueue;

//Import of the Java LinkedList and Java Queue Utility and the Random Utility through all import utility
import java.util.*;


/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: October 11, 2019
*/
public class JavaQueue {

	public static void main(String[] args) {
	/// Declaration section
		
		Queue<Integer> myQueue = new LinkedList<>();
		
		Random rNum = new Random();
			
	///End Declaration section

	/// Populating Queue with data 
		
		// For loop used to make ten random numbers
		for (int index = 0; index < 10; index++) {
			
			// Creates a random Integer from 0 - 100
			int rando = rNum.nextInt(100);
		
			// Adds the random number to the Queue
			myQueue.add(rando);
		
		}		
		
	/// End Queue Population
		
		// Show the contents of the Queue
		System.out.println(myQueue + "The total Queue size is: " + myQueue.size());
		
		// Blank Space addition for aesthetics
		System.out.println(" ");
		
		// Variable for removal
		int first = myQueue.remove();
		
		// Show the contents of the Queue after removal
		System.out.println("First in the Queue is " + first);
		
		System.out.println("The total Queue size is now: " + myQueue.size());
		
	// Exits the program.
	System.exit(1);

	}

}