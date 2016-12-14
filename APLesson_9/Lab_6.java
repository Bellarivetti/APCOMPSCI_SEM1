import java.util.Scanner;

public class Lab_6

//BiggestNumber

{
	static String Array = "";
	
	public static void main(String[]args)
	
	{
		int [] numbers = new int[10];
		
		fillAray(numbers);
		
		System.out.println("The following numbers -  " + printAr(numbers));
		System.out.println("The biggest number is - " + getBig(numbers));
	}
	
	public static void fillAray(int[] nM)
	{
		for (int i = 0; i < nM.length; i++)
		{
			nM[i] = (int)((Math.random()*101));
		}
		
	}
	
	public static String printAr(int[] numbs)
	{
		for (int n: numbs)
		{
			Array += n + " ";
		} 
		
		return Array;
	}
	
	public static int getBig(int[] nuz)
	{
		int max = 0;
		
		for (int nu: nuz)
		{
			if (nu > max)
			{
				max = nu;
			}
			
			else
			{
				max = max;
			}
		}
		return max;
	}
}