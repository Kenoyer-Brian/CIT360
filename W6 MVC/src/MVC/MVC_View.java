// Sets the package to MVC
package MVC;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 16, 2020
*/

/**The MVC_View class
 * Purpose: 
 * @param  none
 * @returns none
 */
public class MVC_View {

	/**The printMVCDetails Method
	 * Purpose: 
	 * @param  String MVCLEDState, String MVCCamState
	 * @returns none
	 */
	public void printMVCDetails(String MVCLEDState, String MVCCamState ) {
		
		//Output the state
		System.out.println("State: ");
		
		//Output the state of LED
		System.out.println("State of LED: " + MVCLEDState);
		
		//Output the state of Cam
		System.out.println("State of CAM: " + MVCCamState);
		
	}/// End printMVCDetails()
	
	
}/// End MVC_View
