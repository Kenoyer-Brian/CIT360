import java.net.*;
import java.io.*;

/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: February 4th, 2020
*/

public class URL_HTTP {
		
	    public static void main(String[] args) throws Exception {
	        URL oracle = new URL("http://www.oracle.com/");
	        URLConnection yc = oracle.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                    yc.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
		
	}

}
