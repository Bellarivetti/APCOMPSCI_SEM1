
import java.util.Scanner;

public class Lab5RUN

//User Runner

{
	public static void main(String[]args)
	
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("First Name: ");
		String iFN = tj.nextLine();
		
		System.out.println("Last Name: ");
		String iLN = tj.nextLine();
		
		System.out.println("Avatar? (yes/no)");
		String iA = tj.nextLine();

		
		if (iA.equalsIgnoreCase("yes"))
		{
			System.out.println("Avatar: ");
			
			String BBB = tj.nextLine();
			
			Lab5 AvUser = new Lab5(iFN, iLN, iA);
			
			AvUser.setAvatar(BBB);
			
			System.out.println(AvUser);
		}
		
		
		if (iA.equals("no"))
		{
			Lab5 NoUser = new Lab5(iFN, iLN);
			System.out.println(NoUser);
		}
	}
}
