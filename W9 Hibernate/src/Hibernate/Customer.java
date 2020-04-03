/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 14, 2020
*/

// Sets the package to Hibernate
package Hibernate;

// Import statement
import javax.persistence.*;

// Selects what database to pull from
@Entity
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
  /// Declaration Section
    
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    private String name;    
    
    @Column(name = "address")
    private String address;
        
    @Column(name = "phone")
    private String phone;
    
  /// Declaration Section
	
    
	/**The getId()
	* @param none 
	* @returns id
	*/
    public int getId() {
    	
    	// Returns id
        return id;
        
    }/// End getId()

    
	/**The setId()
	* @param int id 
	* @returns none
	*/
    public void setId(int id) {
        
    	// Sets this id
    	this.id = id;
    	
    }/// End setId()

    
	/**The getName()
	* @param none 
	* @returns name
	*/
    public String getName() {
    	
    	// Returns name
        return name;
        
    }/// End getName()

    
	/**The setName()
	* @param String name 
	* @returns none
	*/
    public void setName(String name) {
    	
    	// Sets this name
        this.name = name;
        
    }/// End setName()

    
	/**The getAddress()
	* @param none 
	* @returns address
	*/
    public String getAddress() {
    	
    	// Returns address
        return address;
        
    }/// End getAddress()

    
	/**The setAddress()
	* @param String address 
	* @returns none
	*/
    public void setAddress(String address) {
    	
    	// Sets this address
        this.address = address;
        
    }/// End setAddress()

    
	/**The getPhone()
	* @param none
	* @returns phone
	*/
    public String getPhone() {
    	
    	// Returns phone
        return phone;
        
    }/// End getPhone()
    
    
	/**The setPhone()
	* @param String phone
	* @returns none
	*/
    public void setPhone(String phone) {
    	
    	// Sets this phone
        this.phone = phone;
        
    }/// End setPhone()
	
	/**The toString()
	* @param none
	* @returns Integer.toString(id) + " " + name + " " + address + " " + phone;
	*/
    public String toString() {
    	
    	// Returns the listing of the items
        return Integer.toString(id) + " " + name + " " + address + " " + phone;
        
    }/// End toString()
    
}/// End Customer
