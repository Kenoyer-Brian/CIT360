<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>index.jsp</title>
</head>
<body>
	
	<!-- This text is the welcome text-->
	<h1>Test of Servlet.</h1>
		
	<!-- This text is the instruction text -->
	<h2>Press the button to submit the form to the servlet </h2>
	
	<!-- This text is used to call the servlet and sets the form section -->
    <form action="Servlet" method="post">
    
		<!-- This is the Firstname input bar -->
        <p>Firstname<input name="firstname" type="text" /> </p>
        
        <!-- This is the Lastname input bar -->
        <p>Lastname<input name="lastname" type="text" /></p>
        
        <!-- This is the Address input bar -->
        <p>Address<input name="address" type="text" /></p>
        
        <!-- This is the Phonenumber input bar -->
        <p>Phone Number<input name="phonenum" type="tel" /></p>
                
        <!-- This is the Email input bar -->
        <p>Email<input name="email" type="email" /></p>
        
        <!-- This is the submit button -->
        <p><input type="submit" value="Servlet" /></p>
        
    </form> 
    
</body>
</html>