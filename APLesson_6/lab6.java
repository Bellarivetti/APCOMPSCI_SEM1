import java.util.Scanner;

public class lab6

//left triangle

{
	public static void main(String[]args)
	{
		Scanner sInput = new Scanner(System.in);
		
		System.out.println("Input String:");
		
		String tWord = sInput.nextLine();
		int lenS = tWord.length();
		
		for (int i = 0; i <= lenS; i++)
		{
			System.out.println(tWord.substring(i, lenS));
		}
	}
}