// Sets the package to MVC
package MVC;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 16, 2020
*/

/**The MVC_Model class
 * Purpose: 
 * @param  none
 * @returns none
 */
public class MVC_Model {

/// Declaration Section
	
	private String LED;
	private String Cam;
		
/// End Declaration section		
	
	/**The getLED() Method
	* @param none
	* @returns String LED
	*/
	public String getLED() {
		
		// Returns LED
		return LED;
		
}/// End getLED()
	
	
	/**The setLED() Method
	* @param String LED
	* @returns none
	*/
	public void setLED(String LED) {
		
		// Sets the LED value
		this.LED = LED;
		
}/// End setLED
	
	
	/**The getCam() Method
	* @param none
	* @returns Cam
	*/
	public String getCam() {
		
		// Returns  Cam
		return Cam;		
		
}/// End getCam()	
	
		
	/**The setCam() Method
	* @param String Cam
	* @returns none
	*/
	public void setCam(String Cam) {
			
		// Sets the Cam value
		this.Cam = Cam;		
			
}/// End setCam()		
	
}/// End MVC_Model
