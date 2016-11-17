import java.util.Scanner;

public class Lab2

//AverageDigits

{
	static double digits = 0.0;
	static double sum = 0.0;

	
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Input Number:");
		int iNum = tj.nextInt();
		
		System.out.println("The average digits in " + iNum + " is " + avD(iNum));
	}
	
	public static double avD(int number)
	{
		while (number > 0.0)
		{
			digits += 1;
			sum += number % 10;
			number /= 10;
		}
		
		return (sum/digits);
	}
}