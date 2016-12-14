import java.util.Scanner;

//Lucky7s

public class Lab_3

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("Input Number:");
		
		System.out.println(sev(tj.nextInt()));
	}
	
	public static int sev(int num)
	{
		if (num > 0)
		{
			if (num % 10 == 7)
			{
				return 1 + (sev(num/10));
			}
			else
			{
				return 0 + (sev(num/10));
			}
		}
		else
		{
			return 0;
		}
	}
}