import java.util.Scanner;

public class lab8

//song

{
	static String repString;
	
	public static void main(String[]args)
	{
		System.out.println(Sing("Na", 4));
		System.out.println(Sing("Naaa ", 5));
		System.out.println("Hey hey hey heyyyyy");
		System.out.println("Goodbyeeeeeeeee homieeee");
	}
	public static String Sing(String word, int repeat)
	{
		
		for (int i = 1; i <= repeat; i++)
			
		{
			System.out.print(word);
		}
		
		return " ";
	}
}