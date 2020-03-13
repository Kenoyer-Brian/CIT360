// Sets the package to JUnit_Example
package JUnit_Example;

/// Import statement block
	import static org.junit.Assert.*;
	import org.junit.Test;
///End Import statement block

/**The orkTest Class
* @param none 
* @returns none
*/
public class orkTest {

	@Test
	public void Testork() {
		// Creates the test object
		Moar_JSon test = new Moar_JSon();
		
		// Creates the variable output and sets it to 5.0 linked to circumferenceCircle()
		String output = test.Orks(4);
		
		// creates the variable output that holds the answer from the program
		String OrkAnswer = "jobs a good'un boss";
		
		// assert checks the answer with the output
		assertNotNull(OrkAnswer, output);	
		
	}/// End Testork()

}/// End orkTest
