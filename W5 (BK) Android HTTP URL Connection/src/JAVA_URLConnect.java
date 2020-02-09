/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 4th, 2020
*/

// Import of the Java .net utility package
import java.net.*;

//Import of the Java .io utility package
import java.io.*;


public class JAVA_URLConnect {

	
	public static void main(String[] args) throws IOException {
		
		// Declaration of public variable to hold the web address
		String url = "https://www.byui.edu";
		
		// Declaration and Initialization of variable to hold the HTTP code
		String http = null;
		
		// Try block
		try {
			
			// Set variable myURL as URL address
			URL myURL = new URL (url);

			// Opens a connection to the web-page
			HttpURLConnection connect = (HttpURLConnection) myURL.openConnection();
			
			// Buffer that reads in the code
			BufferedReader download = new BufferedReader(new InputStreamReader(connect.getInputStream()));
			
			// Do while loop
			do {
				
				// Prints the contents of the web-site to the console
				System.out.println(http);
			
			//while logic statement that continues as long as readLine does not equal null.
			}while((http = download.readLine()) != null);
			
			// closes the BufferedReader
			download.close();
			
		}///End of try block
		
		
		// Catches Malformed URLS
		catch(MalformedURLException ex){
		
			// The catch statement
			System.out.println("The URL: " + url + "Could not be reached"  );			
			
		}/// End Catch
		
		// The final print
		System.out.println("End of Code."  );
		
		// Exits the program.
		System.exit(1);
		
	} /// End of main()

}/// End of JAVA_URLConnect Class
