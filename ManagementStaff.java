package beans;

public class ManagementStaff
{
	static String Firstn;
static	String Lastn;
	static String Emailid;
	static String password;
	
	
	public static String getFirstn() {
		return Firstn;
	}
	public void setFirstn(String firstn) {
		Firstn = firstn;
	}
	public static String getLastn() {
		return Lastn;
	}
	public void setLastn(String lastn) {
		Lastn = lastn;
	}
	public static String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public static String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
