/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 14, 2020
*/

// Sets the package to Calculator
package Calculator;

/// Import block
import java.util.HashMap;
import java.util.Scanner;
/// End Import block

/**The Calculator Class
* @param none 
* @returns none
*/
public class Calculator {

	/**The main
	* @param String[] 
	* @returns none
	*/
	public static void main(String[] args) {
		
	/// Declaration Section
		
		// holds the input for the first number
		Double inputOne;
		
		// Holds the input for the second number
		Double inputTwo;
		
		// Holds the input for the command
		String command;
		
		// Variable to hold the prompt
		char prompt;
		
	/// End Declaration Section
		

		// Creates the scanner objects
		Scanner userInput1 = new Scanner(System.in);
		
		Scanner userInput2 = new Scanner(System.in);

		// Prints Welcome Message		
		System.out.println("Welcome to the calculator program." );
			
			/// Do while loop
			do {		
				
				// Prints Welcome Message		
				System.out.println("Please enter the first number you would like to work with:" );
				
				// Assigns user for input for add or remove on list.
				inputOne = userInput1.nextDouble();
				
				// Prints Welcome Message		
				System.out.println("Please enter type of math you would like to do (+,-,*,/):" );
				
				// Assigns user for input for add or remove on list.
				command = (String) userInput2.nextLine();
				
				// Prints Welcome Message		
				System.out.println("Please enter the second number you would like to work with:" );
				
				// Assigns user for input for add or remove on list.
				inputTwo = userInput1.nextDouble();				
				
				// Passes Everything to handleCommand
				ACP.handleCommand(command,inputOne,inputTwo);				
				
				// Prints prompt to keep the program going	
				System.out.println("Do you have more calculations to perform? (y for Yes / n for No)");
				
				// prompt for continue of program
				prompt = userInput1.next().charAt(0);
			
			//do-while logic to keep the program running
			} while(prompt == 'y');
			
			// closes the keyboard scanner.
			userInput1.close();
			
			// closes the keyboard scanner.
			userInput2.close();
			
		}/// End Main()
	
		/**The HashMap()
		* @param String[] 
		* @returns none
		*/
		public static HashMap<String, Object> GetCommandData(String key, Object value){
			
			// Creates the HashMap data
			HashMap<String, Object> data = new HashMap<String, Object>();
			
			// puts key and value into the HashMap data
			data.put(key, value);
			
			// Returns data
			return data;
		}/// End HashMap()
		
	}/// End Calculator
