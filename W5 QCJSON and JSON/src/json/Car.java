
// Part of the json package
package json;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 5, 2020
*/


/**The Car class
 * Purpose:
 * @param none
 * @returns make, model and output string
 */
public class Car{
	
	  /// Declaration section
	
	  private String make; 
	  private String model; 
	  
	  ///End Declaration section

	  
      /**The getMake() Method
	  * @param none
	  * @returns make
	  */
	  public String getMake(){
	  	return make; 
	  }/// End getMake()
	  
	  
      /**The setMake() Method
	  * @param make
	  * @returns None
	  */
	  public void setMake(String make){
	  	 this.make = make;
	  }/// End setMake()
	  
	  
      /**The getModel() Method
	  * @param none
	  * @returns model
	  */
	  public String getModel(){
	  	return model; 
	  }/// End getModel()
	  
	  
      /**The setModel() Method
	  * @param model
	  * @returns none
	  */
	  public void setModel(String model){
	  	 this.model = model;
	  }/// End setModel()
	  
	  
      /**The toString() Method
	  * @param none
	  * @returns String
	  */
	  public String toString() {
		  return "Make: " + make + " " + "Model: " + model;
	  }/// End toString()
	  
}/// End Car

