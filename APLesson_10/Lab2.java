import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab2

//Expression Solver

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Input Equation: ");
		String show = tj.nextLine();
		
		ArrayList<String> Eq = new ArrayList<>(Arrays.asList(show.split(" ")));
	
		int i = 0;
		
		while (i < Eq.size())
		{
			if ((Eq.get(i).equals("*")) || (Eq.get(i).equals("/")))
				
			{
				if (Eq.get(i).equals("*"))
				{
					Eq.set(i, "" + (Integer.parseInt(Eq.get(i-1)) * Integer.parseInt(Eq.get(i+1)) ) );
				}
				
				if (Eq.get(i).equals("/"))
				{
					Eq.set(i, "" + (Integer.parseInt(Eq.get(i-1)) / Integer.parseInt(Eq.get(i+1)) ) );
				}
				
				Eq.remove(i-1);
				Eq.remove(i);
			}
			
			else
				
			{
			i++;	
			}
		}
		
		i = 0;
		while(i < Eq.size())
		{
			if ((Eq.get(i).equals("+")) || (Eq.get(i).equals("-")))
			{
				if (Eq.get(i).equals("+"))
				{
					Eq.set(i, "" + (Integer.parseInt(Eq.get(i-1)) + Integer.parseInt(Eq.get(i+1)) ) );
				}
				
				if (Eq.get(i).equals("-"))
				{
					Eq.set(i, "" + (Integer.parseInt(Eq.get(i-1)) - Integer.parseInt(Eq.get(i+1)) ) );
				}
				
				Eq.remove(i-1);
				Eq.remove(i);
			}
			
			else
				
			{
			i++;	
			}
			
		}
		
		System.out.println(Eq);
	}
}