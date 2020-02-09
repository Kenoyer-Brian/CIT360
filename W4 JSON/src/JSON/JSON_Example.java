// Sets the package to JSON
package JSON;

//Import of the Jackson JSON packages
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;


/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 09, 2020
*/

/**The JSON_Example class
 * Purpose: Used for an example of working with JSON with Jackson
 * @param  none
 * @returns none
 */
public class JSON_Example {

	/**The carToJSON() Method
	 * @param Car, car
	 * @returns year
	 */
	public static String carToJSON (Car car) {
		
		// Creates the object mapper
		ObjectMapper mapper = new ObjectMapper();
		
		// Creates the variable automobile
		String automobile = "";
		
		/// Try block
		try {
			automobile = mapper.writeValueAsString(car);
		}/// End try block
		
		/// Catch block
		catch(JsonProcessingException e){
			System.err.println(e.toString());
		}/// End catch block
		
		// Returns automobile
		return automobile;
		
	}/// End carToJSON()
	
	
	/**The JSONToCar() Method
	 * @param automobile
	 * @returns car
	 */
	public static Car JSONToCar (String automobile) {
		
		// Creates the object mapper
		ObjectMapper mapper = new ObjectMapper();
		
		// Creates the variable automobile
		Car car = null;
		
		/// Try block
		try {
			car = mapper.readValue(automobile, Car.class);
		}/// End try block
		
		/// Catch block
		catch(JsonProcessingException e){
			System.err.println(e.toString());
		}/// End catch block
		
		// Returns car
		return car;
		
	}/// End JSONToCar()
	
	
	public static void main(String[] args) {
		Car auto = new Car();
		auto.setYear(1994);
		auto.setMake("BMW");
		auto.setModel("325is");
		
		String json = JSON_Example.carToJSON(auto);
		System.out.println(json);
		
		Car auto2 = JSON_Example.JSONToCar(json);
		System.out.println(auto2);
		
	}/// End main()

}
