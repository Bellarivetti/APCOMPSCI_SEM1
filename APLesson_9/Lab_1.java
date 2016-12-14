import java.util.Scanner;

public class Lab_1

//reverse word

{
	static String neww = "";
	
	public static void main(String[]args)
	{
		String [] ws = new String[5];
		Scanner tj = new Scanner(System.in);
		System.out.println("Input Five Words: ");
		int numero = ws.length;

		for (int i = 0; i < ws.length; i++)
		{
			ws[i] = tj.next();
		}
		
		System.out.println("In Order:");
		for (String w : ws)
		{
			System.out.println(w);
		}
		
		System.out.println("");
		
		System.out.println("Reversed:");
		
		reverse(ws, numero);
	}
	
	public static String reverse(String[] w, int num)
	{	
		for (int i = num - 1; i >= 0; i --)
		{
			neww = w[i];
			System.out.println(neww);
		}
		return "";
	}
}