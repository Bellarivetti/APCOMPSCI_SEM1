import java.util.Scanner;

public class lab1

//box
{
	public static void main(String[]args)

	{
		Scanner tjinput = new Scanner(System.in);
		
		System.out.println("Input String:");
		
		String iString = tjinput.nextLine();
		
		int lString = iString.length();
		
		for (int i = 1; i <= lString; i++)
		{
			System.out.println(iString);
		}
	}
}