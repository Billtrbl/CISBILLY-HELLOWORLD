
public class HELLOWORLD 
{
	// An object is 2 things.
	// 1. Actions. Methods
	// 2. Attributes. Variables.
	private String name = "Billy";
	private String lastName = "Susanto";
	
	// main method. Starts the program.
	// Method Signature - What makes this method unique. Defines the method.
	public static void main(String[] args) 
	{
		HELLOWORLD hw = new HELLOWORLD();
		hw.sayHello();
	}	
		
	// This method says hello when called.
	private void sayHello()
	{
		// Prints to the console.
				System.out.println("Hello World");	
	}
}
