// Sets the package to JSON
package JSON;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 09, 2020
*/

/**The Car class 
 * @param  none
 * @returns none
 */
public class Car {

/// Declaration section
	
	private int year;
	private String make;
	private String model;
	
/// End Declaration section	
	
///Get/Set Year
	
	/**The getYear() Method
	 * @param none
	 * @returns year
	 */
	public int getYear() {
		return year;
	}/// End getYear()

	/**The setYear() Method
	 * @param year
	 * @returns none
	 */
	public void setYear(int year) {
		this.year = year;
	}///End setYear()
	
///End Get/Set Year
		
///Get/Set Make	
	
	/**The getMake() Method
	 * @param none
	 * @returns make
	 */
	public String getMake() {
		return make;
	}/// End getMake()

	/**The setMake() Method
	 * @param make
	 * @returns none
	 */
	public void setMake(String make) {
		this.make = make;
	}///End setMake()

///End Get/Set Make	
	
///Get/Set Model	
	
	/**The getModel() Method
	 * @param none
	 * @returns model
	 */
	public String getModel() {
		return model;
	}/// End getModel()

	/**The setModel() Method
	 * @param model
	 * @returns none
	 */
	public void setModel(String model) {
		this.model = model;
	}///End setModel()
	
///End Get/Set Model
	
	
	/**The setModel() Method
	 * @param none
	 * @returns String
	 */
	public String toString() {
		
		// returns the String of output
		return "Year: " + year + System.getProperty("line.separator") + "Make: " + make + System.getProperty("line.separator") + "Model: " + model;
		
	}/// End toString()
	
	
}///End Car Class

