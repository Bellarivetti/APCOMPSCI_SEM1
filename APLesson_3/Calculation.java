import java.util.Scanner;

public class Calculation
{
	public static void main(String[]args)
	{
		Scanner Mat = new Scanner(System.in);
		
		System.out.println("First number: ");
		int x = Mat.nextInt();
		
		System.out.println("Second number: ");
		int y = Mat.nextInt();
		
		double calc  = x + y;
		
		System.out.println("Answer: " + calc);
	}
}