
public class User 
{
	private String userName;
	private String email;
	private String firstName;
	private String lastName;
	
	// Method signature consists of...
	// Accessor - public, private or protected.
	// Return type - Any type or void for nothing.
	// Method name - make it good so people know what the method does.
	// Argument list - parameters passed to the method.
	public String getUsername() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}