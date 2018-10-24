package Chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService 
{
	
	
	public void addUser()
	{
		
	}
	
	public List<User> loadUser() throws IOException
	{
		List<User> users = new ArrayList<User>();
		File f = new File("users.txt");
		System.out.println("Does the file exist? " + f.exists());
		
		if(f.exists())
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String st;
			while((st = br.readLine()) != null)
			{
				// use the string.split method to break the string up into parts based on
				// the spaces between each name.
				
				String[] splitNames = st.split(" ");
				User u = new User();
				u.setFirst_name(splitNames[0]);
				
				if(splitNames.length > 2)
				{
					u.setMiddle_name(splitNames[1]);
					u.setLast_name(splitNames[2]);
				}
				else
				{
					u.setLast_name(splitNames[1]);
				}
				users.add(u);
			}
		}
		return users;
	}
	
	// test method
	
	public static void main(String[] args)
	{
		UserService rf = new UserService();
		try 
		{
			List<User> users = rf.loadUser()	;
			for(User user : users)
			{
				System.out.println(user.getFirst_name() + " " + user.getLast_name());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
