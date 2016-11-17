import java.util.Scanner;

public class Lab4

//ReplaceAts

{	
	static String inS = " ";
	
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Input String:");
		
		String inS = tj.nextLine();
	
		while (inS.indexOf("a") >= 0)
		{
			inS = inS.substring(0, inS.indexOf("a")) + "@" + inS.substring(inS.indexOf("a") + 1);
		}
		
		System.out.println(inS);
	}	
}