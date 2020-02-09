/**
 * 
 */
package Java_Map;

// Import of the Java HashMap Utility
import java.util.HashMap;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: January 17, 2020
*/

public class Map {


	public static void main(String[] args) {
		
		/// Declaration section
		
			HashMap<String, String> carEngine = new HashMap<String, String>();
				
		///End Declaration section

		/// Populating lists with data 
		
			carEngine.put("BMW M50", "1994 325is");
			carEngine.put("BMW M54tu", "2004 530i");
			carEngine.put("VW BEW", "2004 TDI");
			carEngine.put("BMW N52", "2008 X3");
		
		
		/// End List Population
		
			
		// Display HashMap contents	
		System.out.println(carEngine);
		
		
		// Exits the program.
		System.exit(1);
	}

}
