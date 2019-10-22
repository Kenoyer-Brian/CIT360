/**
 * 
 */
package Java_Set;

//Import of the Java Hash Set Utility
import java.util.HashSet;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: October 11, 2019
*/
public class Set {


	public static void main(String[] args) {
		
		/// Declaration section
		
			HashSet<String> myComputers = new HashSet<String>();
		
		///End Declaration section
		
			myComputers.add("Dell Latitude E6530");
			myComputers.add("Dell Inspiron 1750");
			myComputers.add("HP Procurve DL360 G7");
			myComputers.add("HP Elitebook 8460p");
			myComputers.add("HP Elitebook 6930p");
			myComputers.add("HP Elitedesk 8200");
			
		/// End List Population
		
		System.out.println(myComputers);
		
		// Exits the program.
		System.exit(1);
	}

}
