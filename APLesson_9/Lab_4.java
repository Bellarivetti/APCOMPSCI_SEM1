import java.util.Scanner;

public class Lab_4

//fibonacci Squence

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("Enter Starting Number:");
		int start = tj.nextInt();
		
		System.out.println("Enter Squence Size:");
		int size = tj.nextInt();
		
		int [] Sq = new int[size];
		
		for (int i = 0; i < Sq.length; i++)
		{
			if (i == 0 || i == 1)
			{
				Sq[i] = start;
			}
			
			else
			{
				Sq[i] = Sq[i-1] + Sq [i-2];
			}
			
			System.out.print(Sq[i] + " ");
		}
	}
}