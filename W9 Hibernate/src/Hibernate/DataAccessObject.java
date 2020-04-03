/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: March 14, 2020
*/

// Sets the package to Hibernate
package Hibernate;

//Import statement
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

public class DataAccessObject {

	
	 SessionFactory factory = null;
	 Session session = null;
	 
	 
	 private static DataAccessObject single_instance = null;
	 
	 private DataAccessObject()
	 {
	     factory = HibernateUtilities.getSessionFactory();
	 }
	
	 public static DataAccessObject getInstance()
	 {
	     if (single_instance == null) {
	         single_instance = new DataAccessObject();
	     }

	     return single_instance;
	 }
	 
	 public List<Customer> getCustomers() {

	     try {
	         session = factory.openSession();
	         session.getTransaction().begin();
	         String sql = "from Hibernate.Customer";
	         List<Customer> cs = session.createQuery(sql).getResultList();
	         session.getTransaction().commit();
	         return cs;

	     } catch (Exception e) {
	         e.printStackTrace();
	         // Rollback in case of an error occurred.
	         session.getTransaction().rollback();
	         return null;
	     } finally {
	         session.close();
	     }

	 }
	 
	 public Customer getCustomer(int id) {

	     try {
	         session = factory.openSession();
	         session.getTransaction().begin();
	         String sql = "from Hibernate.Customer where id=" + Integer.toString(id);
	         Customer c = (Customer)session.createQuery(sql).getSingleResult();
	         session.getTransaction().commit();
	         return c;

	     } catch (Exception e) {
	         e.printStackTrace();
	         // Rollback in case of an error occurred.
	         session.getTransaction().rollback();
	         return null;
	     } finally {
	         session.close();
	     }
	 }
	 
	
}
