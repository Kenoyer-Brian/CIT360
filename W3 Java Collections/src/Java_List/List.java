/**
 * 
 */
package Java_List;

// Import of the Java List Utility
import java.util.ArrayList;

//Import of the Java Scanner Utility
import java.util.Scanner;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: October 10, 2019
*/

public class List {


	public static void main(String[] args) {
		
		/// Declaration section
			
			ArrayList<String> myCars = new ArrayList<String>();
			
			
			char prompt, addRemove;
			
			
			int remove;
		
			
			String add;
			
		///End Declaration section
		
		/// Populating lists with data 
		
			//Populating the myCars List
			
				myCars.add("2004 BMW 530i");
				
				myCars.add("1994 BMW 325is");
				
				myCars.add("2004 VW Jetta TDI");
				
				myCars.add("2005 VW Jetta TDI");
				
		/// End List Population
		
			// Prints Welcome Message		
			System.out.println("Welcome to the List Program!");
						
			// Creates Scanner called userInput.
			Scanner userInput = new Scanner(System.in);
			
			// Creates Scanner called userInput.
			Scanner userAdd = new Scanner(System.in);
				
				
		//Output of the lists
		
		System.out.println("The Cars list: " + myCars);
		

		
		do {
		
		// Prints Welcome Message		
		System.out.println("Would you like to add or remove to the list? (a for Add / r for Remove)" );
		
		// Assigns user for input for add or remove on list.
		addRemove = userInput.next().charAt(0);
				
		// Determines if removing from list.
		if(addRemove == 'r') {
			
			
			// Prompts for where to remove from.
			System.out.println("What would you like to remove? (list options at 0 and currently ends at " + (myCars.size()-1)+" )");
			
			// Assigns user for input for remove on list.
			remove = userInput.nextInt();
			
			// Removes the specified item
			myCars.remove(remove);
			
			// Shows the list after removal
			System.out.println("The change to the list is: " + myCars );
			
		}
		
		
		else if (addRemove == 'a') {
			
			// Prompts for where to add to the list.
			System.out.println("What would you like to add to the list?");
						
			// Assigns user input for add on list.
			add = userAdd.nextLine();
			
			// Adds the specified item
			myCars.add(add);
			
			// Shows the list after addition
			System.out.println("The change to the list is: " +myCars );
		}
		
		else {
			
			// Shows the error
			System.out.println("Improper input!" );
			
		}
		
		
		// Prints prompt to keep the program going	
		System.out.println("Do you have more work to do on the list? (y for Yes / n for No)");
		
		// prompt for continue of program
		prompt = userInput.next().charAt(0);
		
		}
		while (prompt == 'y');

		// The Exit statement
		System.out.println("The Final list is: " +myCars );
		
		// closes the keyboard scanner.
		userInput.close();
		
		// closes the keyboard scanner.
		userAdd.close();
		
		// Exits the program.
		System.exit(1);
	}

}
