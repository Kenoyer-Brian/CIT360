// Sets the package
package JUnit_Example; 

/**The Moar_JSon Class
* @param none 
* @returns none
*/	
public class Moar_JSon {
		
		/**The Orks Method
	 	* @param none 
		* @returns none
		*/	
		public String Orks(int choice) {
			
			// Source of quotes from Dawn of War: https://www.youtube.com/watch?v=5UQFvqLGXVU
			
			// Creates the array of ork quotes
			String[] Ork_Sayings = {"UP YOURZ","Fer Gork and Mork","Sod Off","WAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGH","jobs a good'un boss", "Wake up Boyz,it's time for fighting"};
			
			// Selects the quote from the array
			String SluggaBoyQuoteOfTheDay1 = Ork_Sayings[choice];
			
			// Returns the value from the array
			return SluggaBoyQuoteOfTheDay1;
			
		}/// End Orks
				
		
		/**The comparisons Method
	 	* @param none 
		* @returns none
		*/	
		public boolean comparisons(int number) {
			
			// number is even or Odd
			
			// if logic statement that determines if number is even
			if(number % 2 == 0) {
				
				// Sets value as true
				boolean value = true;
				
				// Returns the value as true
				return value;
				
			}// End if Block
			
			// Else to handle not even
			else {
			
				// Sets value as false
				boolean value = false;				
				
				// Returns the value as false
				return value;
				
			}// End Else Block

			
		}/// End comparisons
				
		
		/**The comparisons Method
	 	* @param none 
		* @returns none
		*/	
		public Double[] Arrays() {

			// Creates Array1 for testing with
			Double[] Array1 = {12.5,15.3,66.7,123.0,777.0};
						
			// Returns Array1
			return Array1;
			
		}/// End Orks		
		
	}/// End Moar JSon
