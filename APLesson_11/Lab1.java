import java.util.Scanner;
public class Lab1

//random numbers

{
	public static void main(String[]args)
	
	{
		int [][] num = new int [4][4];
		
		for (int i = 0; i < num.length; i++)
			
		{
			for (int j = 0; j < num[i].length; j++)
			{
				num[i][j] = (int)((Math.random()*101));
			}
		}
		
		for (int i = 0; i < num.length; i++)
			
		{
			for (int j = 0; j < num[i].length; j++)
			{
				System.out.print(num[i][j] + "\t");
			}
			
			System.out.println("");
		}
	}
}