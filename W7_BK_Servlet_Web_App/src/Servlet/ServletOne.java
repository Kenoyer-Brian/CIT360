// Sets the package to Servlet
package Servlet;


/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 16, 2020
*/

//Import of the utility packages required to function
import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**The MVCPatternDemo class
 * Purpose: 
 * @WebServlet extends HttpServlet
 * @returns none
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Declares and Initializes the ServletConfig config and sets at null.
	ServletConfig config = null;
       
	/**The init() Method
	* @param ServletConfig sc
	* @returns none
	*/
	public void init(ServletConfig sc) throws ServletException {

		// sets the config value to sc
		config = sc;
		
		// Prints out to the console when the init method is triggered.
		System.out.println("running init method");
		
		
	}/// End init()

	
	/**The destroy() Method
	* @param none
	* @returns none
	*/
	public void destroy() {
		
		// Prints out to the console when the destroy method is triggered.
		System.out.println("running destroy method");
		        
	}/// End destroy()
		 
	
	/**The getServletInfo() Method
	* @param none
	* @returns String "ServletOne"
	*/
	public String getServletInfo(){ 
			 
			// returns ServletOne
		    return "ServletOne";
		        
	}/// End getServletInfo()
		 
	
	/**The getServletConfig() Method
	* @param none
	* @returns config
	*/
	public ServletConfig getServletConfig(){ 
		        
			 // returns config
			 return config; 
			 
	}/// End getServletConfig()

		 
	/**The service() Method
	* @param HttpServletRequest request, HttpServletResponse response
	* @returns none
	*/
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Sets the response to text/html
		response.setContentType("text/html");
		
		// calls the PrintWriter class
		PrintWriter html = response.getWriter();
		
		// output of the h1 line
		html.println("<h1>Servlet One Example</h1>");
		
		// output of the h1 line
		html.println("<h2>This is being displayed dynamically from ServletOne.java</h2>");
		
		// Prints out to the console when the service method is triggered.
		System.out.println("running service method");
		
		
	}/// End service method

		
}/// End ServletOne class
