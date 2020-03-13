// Sets the package
package JUnit_Example;

import static org.junit.Assert.*;

import org.junit.Test;

/**The ComparisonTest Class
* @param none 
* @returns none
*/
public class ComparisonTest {
	
	@Test
	public void testFalse() {
		
		Moar_JSon test = new Moar_JSon();
		
		// Creates the variable output and sets it to 5
		boolean output = test.comparisons(5);

		// assert checks the answer with the output
		assertFalse(output);	
	
	}/// End testFalse() 


	@Test
	public void testTrue() {
	
		Moar_JSon test = new Moar_JSon();
		
		// Creates the variable output and sets it to 4
		boolean output = test.comparisons(4);
	
		// assert checks the answer with the output
		assertTrue(output);
	
	}/// End testTrue() 
	
	
	@Test
	public void testTruevsFalse() {
		
		Moar_JSon Object1 = new Moar_JSon();
		
		Moar_JSon Object2 = new Moar_JSon();
		
		assertNotSame(Object1,Object2);
		
	}/// End testTruevsFalse()	
	
}/// End ComparisonTest
