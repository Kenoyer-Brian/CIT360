
// Part of the json package
package json;

// Import Statements
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 5, 2020
*/


/**The Jackson_JSON class
 * Purpose: Show Proficiency in JSON usage. Creates a JSON File, then reads from the JSON File.
 * @param  none
 * @returns none
 */
public class Jackson_JSON {		
	
	/**The carToJSON() Method
	 * @param car
	 * @returns automobile
	 */
	public static String carToJSON(Car car) {
	
		// Creation of mapper object
		ObjectMapper mapper = new ObjectMapper();
		
		// Creation of the automobile variable
		String automobile = null;	
		
		// Try block
		try {
			
			// Assigns car to m
			car = mapper.readValue(automobile, Car.class);
		}/// End try
		
		// Catch block
		catch(JsonProcessingException e){
			
			// print to the standard error
			System.err.println(e.toString());
			
		}/// End catch
		
		// Return of automobile
		return automobile;	
		
	}/// End carToJSON()

	
	/**The JSONToCar() Method
	 * @param automobile
	 * @returns car
	 */
	public static Car JSONToCar(String automobile) {
		
		// Creation of mapper object
		ObjectMapper mapper = new ObjectMapper();
		
		// Creation of car with a call to the Car class
		Car car = null;	
		
		// Try block
		try {
			car = mapper.readValue(automobile, Car.class);
		}/// End try
		
		// Catch block
		catch(JsonProcessingException e) {
			
			// print to the standard error
			System.err.println(e.toString());
			
		}/// End catch
		
		return car;	
	}/// End JSONToCar()
	
	/**The main() Method
	 * @param args 
	 * @returns none
	 */
	public static void main(String[] args) {
		
		// Creation of the automobile object
		Car automobile = new Car();
		
		// Setting BMW as make
		automobile.setMake("BMW");
		
		// Setting 325is as model
		automobile.setModel("325is");			
		
		// Exits the program.
		System.exit(1);
		
	}/// End Main()

}/// End Jackson_JSON
