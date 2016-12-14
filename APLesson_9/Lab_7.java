import java.util.Scanner;

public class Lab_7

//find the Z'stati

{
	static String Ar = "";
	
	public static void main(String[]args)
	
	{
		String [] Ws = new String[5];

		fillAr(Ws);
		
		System.out.println("For the words -  " + printAr(Ws));
		
		System.out.println(hZs(Ws) + " - contain[s] the letter 'Z'.");
	}
	
	public static void fillAr(String[] WS)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("Input Five Words:");
		
		for (int i = 0; i < WS.length; i++)
		{
			WS[i] = tj.next();
		}
	}
	
	public static String printAr(String[] Pierre)
	{
		for (String w: Pierre)
		{
			Ar += w + " ";
		}
		
		return Ar;
		
	}
	
	public static String hZs(String[] wD)
	{
		String Zs = "";
		
		for (String iP: wD)
			
		{
			if (iP.indexOf("z") >= 0)
			{
				Zs += iP + " ";
			}
			
			else
			{
				Zs += "";
			}
			
		}
		return Zs;
	}
}