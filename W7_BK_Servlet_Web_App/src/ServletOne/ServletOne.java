package ServletOne;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(name = "Servlet", urlPatterns={"/Servlet"})
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}/// End doGet()

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/// End Declaration section
		
		// Variable to hold the firstname
		String firstName = request.getParameter("firstname");
		
		// Variable to hold the lastName
		String lastName = request.getParameter("lastname");
		
		// Variable to hold the address
		String address = request.getParameter("address");
		
		// Variable to hold the phoneNumber
		String phoneNumber = request.getParameter("phonenum");
		
		// Variable to hold the email
		String email = request.getParameter("email");

	/// End Declaration section
		
		//sets the html PrintWriter object
		PrintWriter html = response.getWriter();
		
		// Sets the content type to Text/HTML
		response.setContentType("text/html");
		
		// Sets the starts for the html section and the body section
		html.println("<html><head></head><body>");
		
		// Sets Header1
		html.println("<h1> Form Info </h1>");
		
		// Displays the first name
		html.println("<p>First Name: " + firstName + "</p>");
		
		// Displays the first name
		html.println("<p>Last Name: " + lastName + "</p>");
		
		// Displays the first name
		html.println("<p>Address: " + address + "</p>");
		
		// Displays the first name
		html.println("<p>Phone Number: " + phoneNumber + "</p>");
		
		// Displays the first name
		html.println("<p>Email: " + email + "</p>");
		
		// Closes the Body and html sections
		html.println("</body></html>");
		
		// calls the DoGet Method
		doGet(request, response);
		
	}/// End doPost()

}/// End ServletOne
