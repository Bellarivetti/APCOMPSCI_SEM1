import java.util.Scanner;
public class Lab5

//game gun

{
	static int bulletCount = 96;
	static int clip = 16;
	static int shotCount = 16;
	static String [] clips = new String [16];
	public static void main(String[]args)
	
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Reload!");
		resetclip();
		
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = tj.nextLine();
			
			if (action.equalsIgnoreCase("R"))
			{
				reload();
			}
			
			if (action.equalsIgnoreCase("S"))
			{
				System.out.println(shoot());
			}
			
			printClip();
		}
	}
	
	public static void resetclip()
	
	{
		for (int j = 0; j < clips.length; j++)
		
		{
			clips[j] = "[]";
		}
	}
	
	public static String shoot(){
		if (shotCount > 0)
		{
			clips[shotCount-1] = "[]";
			shotCount -= 1;
			System.out.println("\nBoom!");
		}
		
		else
		{
			System.out.println("\nReload!");
		}
		
		return "";
	}
	public static void reload()
	{
		if (bulletCount >= clip)
		{
			bulletCount -= clip;
			shotCount = clip;
		}
		
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		
		resetclip();
		
		for (int j = 0; j < shotCount; j++)
		
		{
			clips[j] = " * ";
		}

	}
	
	public static void printClip()
	{
		String output = "";
		output = "Bullet Amount: \t" + bulletCount + "\nClip:\t";
		
		for (int j = 0; j < clip; j++)
		{
			output += clips[j];
		}
		
		System.out.println(output);
	}
}

