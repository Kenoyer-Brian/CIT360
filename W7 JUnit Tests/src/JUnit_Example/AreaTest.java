// Sets the package to JUnit_Example
package JUnit_Example;

/// Import statment block
	import static org.junit.Assert.*;
	import org.junit.Test;
///End Import statment block
	
/**The AreaTest Class
 * @param none 
 * @returns none
 */
public class AreaTest {


	/**The radiusTest() Method
	 * @param none 
	 * @returns none
	 */
	@Test
	public void areaTest() {
		
		// Creates the test object
		CircleEquations test = new CircleEquations();
		
		// variable to hold the answer
		Double areaAnswer = 78.5;
		
		// creates the variable output that holds the answer from the program
		Double output = test.areaCircle(5.0);
		
		// assert checks the answer with the output
		assertEquals(areaAnswer, output);		
		
		
	}/// End areaTest()
	
}/// End AreaTests
