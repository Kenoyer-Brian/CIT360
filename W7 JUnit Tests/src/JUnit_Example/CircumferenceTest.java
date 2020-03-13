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
	public void TestCircumference() {
		
		// Creates the test object
		CircleEquations test = new CircleEquations();
		
		// Creates the variable output and sets it to 5.0 linked to circumferenceCircle()
		Double output = test.circumferenceCircle(5.0);
		
		// creates the variable output that holds the answer from the program
		Double CircumferenceAnswer = 31.4;
		
		// assert checks the answer with the output
		assertEquals(CircumferenceAnswer, output);		
		
		
	}/// End CircumferenceTest()
	
}/// End CircumferenceTest
