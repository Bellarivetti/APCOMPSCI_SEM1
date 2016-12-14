import java.util.Scanner;

public class Lab_2

//first letter

{
	public static void main(String[]args)
	{
		String [] w = new String[5];
		Scanner tj = new Scanner(System.in);
		System.out.println("Input Five Words:");
		
		for (int i = 0; i < w.length; i++)
		{
			w[i] = tj.next();
		}
		
		System.out.println("\nFirst Letters:");
		
		first(w);
	}
	public static String first(String[] words)
	{
		for (String w : words)
			{
				System.out.println(w.charAt(0));
			}
			return "";
	}
}
