// Sets the package to MVC
package MVC;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 16, 2020
*/

/**The MVC_Controller class
 * Purpose: 
 * @param  none
 * @returns none
 */

public class MVC_Controller {

	/// Declaration section
	
	private MVC_Model model;
	private MVC_View view;

/// End Declaration section		
	
	
	/**The MVC_Controller() Method
	 * @param MVC_Model mode, MVC_View view 
	 * @returns none
	 */
	public MVC_Controller(MVC_Model model, MVC_View view ) {
		
		// Sets the model variable
		this.model = model;
		
		// Set the view variable
		this.view = view;
						
	}/// End MVC_Controller()
	
	
	/**The MVC_Controller() Method
	 * @param MVC_Model mode, MVC_View view 
	 * @returns none
	 */
	public void setLEDState(String LED) {
		
		// Calls model, setLED and passes and passes LED
		model.setLED(LED);
		
	}/// End setCamState()
	
	
	/**The getCamState() Method
	 * @param none
	 * @returns model.getLED
	 */
	public String getLEDState() {
		
		// Returns model.getLED
		return model.getLED();
		
	}/// End getCamState()
	
	
	/**The setCamState() Method
	 * @param String Cam
	 * @returns none
	 */
	public void setCamState(String Cam) {
		
		// Calls model, setCam and passes and passes Cam
		model.setCam(Cam);
		
	}/// End setCamState()
	
	
	/**The getCamState() Method
	 * @param none
	 * @returns model.getCam
	 */
	public String getCamState() {
		
		return model.getCam();
		
	}/// End getCameState()
	
	
	/**The updateView() Method
	 * @param none
	 * @returns none
	 */
	public void updateView() {
		
		// Calls printStudentDetails from view and passes model.getName() and model.getRollNo()
		view.printMVCDetails(model.getLED(), model.getCam());
		
	}/// End updateView()
	
	
}/// End MVC_Controller
