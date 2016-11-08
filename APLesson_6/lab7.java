import java.util.Scanner;

public class lab7

//right triangle

{
	public static void main(String[]args)
	{
		Scanner sInput = new Scanner(System.in);
		System.out.println("Input String:");
		String tword = sInput.nextLine();
		int wordlength = tword.length();
		
		for (int i = tword.length(); i >= 0; i--)
		{
			System.out.println(tword.substring(i));
		}
	}
}