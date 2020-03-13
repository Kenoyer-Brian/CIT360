// Sets the package
package JUnit_Example;

import static org.junit.Assert.*;

import org.junit.Test;

/**The ArrayTest Class
* @param none 
* @returns none
*/
public class ArrayTest {

	@Test
	public void testFalse() {
		
		// Creates the object test
		Moar_JSon test = new Moar_JSon();
		
		// creates the separate array that tests against the original
		Double[] Array2 = {12.5,15.3,66.7,123.0,777.0};
		
		// Creates the variable output and sets it to the output from the method
		Double[] output = test.Arrays();

		// assert checks the answer with the output
		assertArrayEquals(Array2,output);	
	
	}/// End testFalse() 

}/// End ArrayTest