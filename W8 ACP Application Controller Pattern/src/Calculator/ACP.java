/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 14, 2020
*/

// Sets the package to Calculator
package Calculator;

/// Import block
import java.util.HashMap;
import handlers.*;
/// End Import block


/**The ACP Class
* @param none 
* @returns none
*/	
public class ACP {

	// Creates the HashMap
	public static HashMap<String, CalculatorHandler> key = new HashMap<String, CalculatorHandler>();

	// The handleCommand Method
	public static void handleCommand(String command, Double inputOne, Double inputTwo) {
		
		// Populates the hash map with Addition values and calls the Addition method
		key.put("+", new Addition());
		
		// Populates the hash map with Subtraction values and calls the Subtraction method
		key.put("-", new Subtraction());
		
		// Populates the hash map with Multiplication values and calls the Multiplication method
		key.put("*", new Multiplication());
		
		// Populates the hash map with Division values and calls the Division method
		key.put("/", new Division());

		// Creates an Object for the handler and passes the command variable to it
		CalculatorHandler handler = key.get(command);
		
		// Passes the input to execute
		handler.execute(inputOne, inputTwo);
		
		
	}/// End handleCommand Method
	
	
}/// End of ACP Class
