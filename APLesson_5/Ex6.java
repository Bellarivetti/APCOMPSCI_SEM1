import java.util.Scanner;
public class Ex1
{
	static String T;
	static String P;
	
	public static void main(String[]args)
	{
	Scanner tj = new Scanner(System.in);
	System.out.println("Username: ");
	T = tj.next();
	System.out.println("Password: ");
	P = tj.next(); 
	
	bCheck(); 
	
	}
	
	
	
	public static void bCheck()
	{
		if(T.equals("Unicorn") && P.equals("Milk79"))
		{
		System.out.println("Access Granted."); 
		}
		else if (!T.equals("Unicorn") && T.equals("Milk79"))
		{
		System.out.println("Password: Correct      Username: Incorrect     Access Denied");
		}	
		else if (!T.equals("Milk79") && T.equals("Unicorn"))
		{
		System.out.println("Password: Incorrect      Username: Correct     Access Denied");
		}
		else
		{	
		System.out.println("Password & Username: Incorrect     Access Denied");	
		}
	}
}