import java.lang.Math;

public class Lab5

{
	private String Fname, LastN, Avatar;
	private int UserID;

	public Lab5()
	{
		Fname = "";
		LastN = "";
		Avatar = "";
		UserID = 0;
	}
	
	public Lab5(String Fn, String Ln)
	{
		Fname = Fn;
		LastN = Ln;
		Avatar = "Undefined";
		UserID = (int)(Math.random() * 1000000) + 1; 
	}

	public Lab5(String Fn, String Ln, String Av)
	{
		Fname = Fn;
		LastN = Ln;
		Avatar = Av;
		
		UserID = (int)(Math.random() * 1000000) + 1;
	}

	public void setAvatar(String a)
	{
		Avatar = a;
	}

	public String toString()
	{
		return "User Info...\nFirst Name: " + Fname +
                           "\nLast Name: " + LastN +
                           "\nAvatar : " + Avatar +
                           "\nUser ID No. : " + UserID;
	}

	public String getFname()
	{
		return Fname;
	}
	
	public String getLastN()
	{
		return LastN;
	}
	
	public String getAvatar()
	{
		return Avatar;
	}
	
	public int getID()
	{
		return UserID;
	}
}
