import java.util.Scanner;

public class Lab1

//Digitadder

{	
	static int integer;
	static int sum= 0;

	public static void main(String[]args)
	
	{
		Scanner user_input = new Scanner(System.in);	
		
		System.out.println("Enter number: ");
		integer = user_input.nextInt();
		
		sumDig();
		System.out.println("Sum of the digits in " + integer + " is " + sum);

	}	

	public static void sumDig()
	
	{
		int num = integer;
		while (num > 0)
		{
			sum += num%10;
			num /= 10;
		}
	}		
}