
import java.util.Scanner;

public class lab5

//count by x

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("Maximum number: ");
		int max = tj.nextInt();
		
		System.out.println("Number to count by: ");
		int skip = tj.nextInt();
		
		for (int i=0; i <= max; i+=skip)
		{
			System.out.printf("\n %d ",  i);
		}
	}
}