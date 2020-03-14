/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 14, 2020
*/

// Sets the package to Calculator
package handlers;

// Import Statements
import Calculator.CalculatorHandler;

/**The Addition Class
* @param implements CalculatorHandler 
* @returns none
*/
public class Addition implements CalculatorHandler{

	/**The execute()
	* @param Double inputOne, Double inputTwo 
	* @returns none
	*/
	public void execute(Double inputOne, Double inputTwo) {
		
		// Performs the Math for the class
		Double sum = inputOne + inputTwo;
		
		// Outputs the sum to the console 
		System.out.println(sum);
		
	}/// End execute()
	
}/// End Addition
