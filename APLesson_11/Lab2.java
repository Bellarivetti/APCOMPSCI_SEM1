import java.util.Scanner;
public class Lab2

//strings

{
	public static void main(String[]args)
	
	{
		String [][] words = new String[4][4];
		
		Scanner tj = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++)
		{
			
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.println("Enter Word:");
				words[i][j] = tj.nextLine();
			}
			
		}
		
		for (int i = 0; i < words.length; i++)
			
		{
			
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			
			System.out.println("");
		}
	}
}