import java.util.Scanner;

public class Lab3

//ReverseNumber

{	
	static int rev = 0;

	public static void main(String[]args)
	
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Input Number:");
		
		int iNum = tj.nextInt();
		
		System.out.println("Reverse of " + iNum + " is " + getReverse(iNum));
	}
	
	public static int getReverse(int number)
	{
		while (number > 0)
		{
			rev *= 10;
			rev += number % 10;
			number /= 10;
		}
		return (rev);
	}
}