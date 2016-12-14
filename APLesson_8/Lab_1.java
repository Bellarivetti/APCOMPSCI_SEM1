import java.util.Scanner;

//Underscores

public class Lab_1

{	
	public static void main(String[]args)
	
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("Input String:  ");
		
		String s = tj.nextLine();
		System.out.println(rep(s));
	}
	
	public static String rep(String s)
	{
		if (s.indexOf(" ") > 0)
		{
			s = s.substring(0, s.indexOf(" ")) + "_" + s.substring(s.indexOf(" ") + 1);
			return rep(s);
		}
		else
		{
			return s;
		}
	}
}