/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 14, 2020
*/

// Sets the package to Hibernate
package Hibernate;

//Import statement
import java.util.*;


/**The Hibernate Class
* @param none 
* @returns none
*/	
public class Hibernate {

	
	/**The main Method
	* @param String[] args 
	* @returns none
	*/	
	public static void main(String[] args) {

		//
	    DataAccessObject t = DataAccessObject.getInstance();

	    //
	    List<Customer> c = t.getCustomers();
	     
	    //
	    for (Customer i : c) {
	    	 
	    	 //
	         System.out.println(i);
	         
	    }// End For

	    //
	    System.out.println(t.getCustomer(1));

	}/// End main()

}/// End Hibernate
