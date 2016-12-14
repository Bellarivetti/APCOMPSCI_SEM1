import java.util.Scanner;

public class Lab_5

//get odds

{
	static String numL = "";
	
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		FillAray(numbers);
		System.out.println("The following numbers - " + printArray(numbers));
		System.out.println(getOdds(numbers) + " - are all odd numbers.");
	}
	
	public static void FillAray(int[] nbr)
	{
		for (int i = 0; i < nbr.length; i++)
		{
			nbr[i] = (int)((Math.random()*101));
		}
		
	}
	
	public static String printArray(int[] nS)
	{
		for (int n: nS)
		{
			numL += n + " " ;
		} 
		
		return numL;
	}
	
	public static String getOdds(int[] numbs)
	{
		String odds = "";
		for (int nu: numbs)
		{
			if ((nu % 2) == 0)
			{
				odds += "";
			}
			
			else
			{
				odds += nu + " ";
			}
		}
		return odds;
	}
}