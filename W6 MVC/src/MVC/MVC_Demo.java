// Sets the package to MVC
package MVC;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 16, 2020
*/

/**The MVC_Demo class
 * Purpose: 
 * @param  none
 * @returns none
 */
public class MVC_Demo {

	/**The main() Method
	* @param String[] args
	* @returns none
	*/
	public static void main(String[] args) {

		// Fetch current status of system
		MVC_Model model = retriveData();
		
		// Creates the view object
		MVC_View view = new MVC_View();
		
		// Creates the controller object
		MVC_Controller controller = new MVC_Controller(model, view);
		
		// calls updateView() with controller object
		controller.updateView();
		
		// calls updateView() with controller object
		controller.setLEDState("Off");
		
		// calls updateView() with controller object
		controller.setCamState("Off");
		
		// calls updateView() with controller object
		controller.updateView();
		
				
	}/// End Main()

	/**The retriveData() Method
	* @param none
	* @returns state
	*/
	private static MVC_Model retriveData() {
		
		// Creates the state object
		MVC_Model state = new MVC_Model();
		
		// Sets setMVCLEDState
		state.setLED("On");
		
		// Sets setMVCCamState
		state.setCam("On");
		
		// Returns state
		return state;
				
	}/// End retriveData()
	
	
}/// End MVC_Demo
