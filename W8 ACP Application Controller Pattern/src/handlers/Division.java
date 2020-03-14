/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 14, 2020
*/

// Sets the package to Calculator
package handlers;

//Import Statements
import Calculator.CalculatorHandler;

/**The Division Class
* @param implements CalculatorHandler 
* @returns none
*/
public class Division implements CalculatorHandler{

	/**The execute()
	* @param Double inputOne, Double inputTwo 
	* @returns none
	*/
	public void execute(Double inputOne, Double inputTwo) {
		
		// Performs the Math for the class
		Double division = inputOne / inputTwo;
		
		// Outputs the sum to the console 
		System.out.println(division);
		
	}/// End execute()
	
}/// End Division
