import java.util.Scanner;

public class Lab_3

//average numbers

{	
	static int ave = 0;
	static int sum = 0;
	
	public static void main(String[]args)
	{
		int [] Numbs = new int[10];
		for (int i = 0; i < Numbs.length; i++)
			
		{
			Numbs[i] = (int)((Math.random()*101));
		}
		
		System.out.println("Numbers:");
		
		for (int Nm: Numbs)
			
		{
			System.out.print(Nm + " ");
		}
		
		System.out.println("");
		
		System.out.println("The ave of the above Numbs is: " + ave(Numbs));
	}	
	public static int ave(int[] ns)
	{
		for (int num : ns)
			
		{
			sum += num;
		}
		
		return sum/ns.length;
	}
}