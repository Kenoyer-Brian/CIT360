/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 1, 2020
*/

// Sets the package to JUnit_Example
package JUnit_Example;


/**The CircleEquations Class
* @param none 
* @returns none
*/	
public class CircleEquations {

	//Declaration of PI
	Double PI = 3.14;
	
	/**The circumferenceCircle()
	* @param none 
	* @returns none
	*/	
	public Double circumferenceCircle(Double radius) {
		
		// Performs the equation for diameter and leaves the number in long form		
		Double dirtyCircumference = 2*PI*radius;
		
		// Variable to round the answer to two decimal places.
		Double circumference = Math.round(dirtyCircumference * 100.0) / 100.0;
		
		// Returns the completed equation
		return circumference;
		
		
	}/// End circumferenceCircle()
	
	
	
	/**The areaCicle()
	* @param none 
	* @returns none
	*/	
	public Double areaCircle(Double radius) {
		
		// Performs the equation for area and leaves the number in long form		
		Double dirtyArea = (radius*radius)*PI;
		
		// Variable to round the answer to two decimal places
		Double area = Math.round(dirtyArea * 100.0) / 100.0;
		
		// Returns the completed equation
		return area;
		
		
	}/// End areaCicle()	
	
	
}/// End CircleEquations
