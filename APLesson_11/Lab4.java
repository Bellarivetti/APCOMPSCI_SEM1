import java.util.Scanner;
public class Lab4

//divisor

{
public static void main(String[]args)

	{
		int [][] num = new int [4][4];
		Scanner tj = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++)
		{
			
			for (int j = 0; j < num[i].length; j++)
			{
				num[i][j] = 1 + (int)((Math.random()*100));
				System.out.print(num[i][j] + "\t");
			}
			
			System.out.println("");
			
		}
		
		System.out.println("Enter Number:");
		
		int divisor = tj.nextInt();
		int count = 0;
		
		for (int i = 0; i < num.length; i++)	
		{
			
			for (int j = 0; j < num[i].length; j++)
			{
				
				if (num[i][j] % divisor == 0)
				{
					count += 1;
				}
				
			}
		}
		
		System.out.println("They're " + count + " numbers divisible by " + divisor + " in the array above.");
	}
}