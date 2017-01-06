import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab1

//keep composites

{	
	public static void main(String[]args)
	
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
		
		int numsSize = nums.size();
		
		System.out.println(remP(nums));
		
	}

	public static int Gfactor(int n)
	{
		for (int i = 2; i < n; i++)
			
		{
			if ((n % i) == 0)
			{
				return 1;
			}
		}
		
		return 0;
	}
	
	public static ArrayList<Integer> remP(ArrayList<Integer> Nmbr)
	
	{
		for (int i = 0; i < Nmbr.size(); i++)
			
		{
			if (Gfactor(Nmbr.get(i)) == 0)
			{
				Nmbr.remove(i);
				i = i - 1;
			}
		}
		
		return Nmbr;
	}
}