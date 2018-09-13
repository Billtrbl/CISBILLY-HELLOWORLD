// Namespace - keeeping objects unique.
// translates to a folder
// Helps you organize 'like' code.
// App is the entry point to our application.
public class App {
	
	public static void main(String[] args)
	{
		User u1 = new User();
		u1.setFirstName("George");
		u1.setLastName("John");
		u1.setEmail("george@john.com");
		u1.setUserName("gjohn");
		
		User u2 = new User();
		u2.setFirstName("George");
		u2.setLastName("John");
		u2.setEmail("george2@john.com");
		u2.setUserName("gjohn");
		
		// call a service that returns hundreds of users...
		
		User u3 = new User();
		u3.setFirstName("Billy");
		u3.setLastName("Susanto");
		u3.setEmail("sbillysusanto@yccc.edu");
		u3.setUserName("sbillysusanto");
		
		User u4 = new User();
		u4.setFirstName("Billy");
		u4.setLastName("Susanto");
		u4.setEmail("bsusanto8@gmail.com");
		u4.setUserName("Billtrbl");
		
		System.out.println(u1.getEmail());
		System.out.println(u2.getEmail());
		System.out.println(u3.getfirstName());
		System.out.println(u4.getUsername());
		
	
		// for loop
		for(int x = 0; x < 100; x++)
		{
			// Prompt user to guess a letter.
			
			// Prompt user with mask of word(recalculate mask)
			
			// Prompt user with hint.
			
			// Collect user input.
			
			// Repeat..
			
			
			
			System.out.println(x);
			
		} // increment counter
	}
	
	// Ask Mike how the heck to do this...
	private void generateMask()
	{
		// Print the word for now
	}
}
