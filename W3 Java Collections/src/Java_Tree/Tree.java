/**
 * 
 */
package Java_Tree;

//Import of the Java HashMap Utility
import java.util.TreeSet;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: October 11, 2019
*/
public class Tree {


	public static void main(String[] args) {


		/// Declaration section
		
			TreeSet<String> myBikes = new TreeSet<String>();
		
		///End Declaration section

		/// Populating lists with data 
			
			myBikes.add("2004 Yamaha XV1700");
			myBikes.add("1986 Honda VF700C");
			myBikes.add("2008 BMW K1200R");
			
		/// End List Population
			
		// Display TreeSet contents	
		// Note that it organizes automatically the contents by oldest to newest.
		System.out.println(myBikes);
		
		// Exits the program.
		System.exit(1);
		
	}

}
