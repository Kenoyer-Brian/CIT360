
/* @author ZEKE (AKA Brian Kenoyer)
*Name: Brian Kenoyer
*Class: CIT-360 
*Date: October 11, 2019
*/

// Start of Class Thread_One
class Thread_One extends Thread{
	
	// Run Method for Thread_Two
	public void run(){
		
		//For loop to test the threading setup
		for(int index=1; index <=5; index++){
			
			//Print out to show iteration of the loop
			System.out.println("Test " + index);
			
			try { Thread.sleep(500); } catch(Exception e) {}
			
		}///End of for loop
		
	}/// End of run()
	
}/// End of Thread_One

//Start of Class Thread_One
class Thread_Two extends Thread{
	
	// Run Method for Thread_Two
	public void run(){
		
		//For loop to test the threading setup
		for(int index=1; index <=5; index++){
			
			//Print out to show iteration of the loop
			System.out.println("Test$ " + index);
			
			try { Thread.sleep(500); } catch(Exception e) {}
			
		}///End of for loop
		
	}/// End of run()
	
}/// End of Thread_Two


//Start of Class Thread_Class
public class Thread_Class {

	// Start of main() method
	public static void main(String[] args) {
		
		// Creation of a new object (called obj1) for the Thread_One class
		Thread_One obj1 = new Thread_One();
		
		// Creation of a new object (called obj2) for the Thread_Two class
		Thread_Two obj2 = new Thread_Two();
		
		//Call to the run method within the Thread_One Class through the object obj1
		obj1.start();
		
		//Call to the run method within the Thread_Two Class through the object obj2
		obj2.start();
		


		
	}/// End of main()
	
	
}/// End of Thread_Class
