// Sets the package to JUnit_Example
package JUnit_Example;

/// Import statment block
	import static org.junit.Assert.*;
	import org.junit.Test;
///End Import statment block

/**The CircumferenceTest Class
* @param none 
* @returns none
*/	
public class CircumferenceTest {

	/**The CircumferenceTest() Method
	 * @param none 
	 * @returns none
	 */
	@Test
	public void CircumferenceTest() {
		
		// Creates the test object
		CircleEquations test = new CircleEquations();
		
		// Creates the variable output and sets it to 5.0 linked to circumferenceCircle()
		Double output = test.circumferenceCircle(5.0);
		
		//
		Double CircumferenceAnswer = 31.4;
		
		assertEquals(CircumferenceAnswer, output);		
		
		
	}/// End CircumferenceTest()
	
}/// End CircumferenceTest
