import java.util.Scanner;

public class Rectangle43
	{
		static double len;
		static double wid;
		static double p;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("Length of the rectangle:");
			len = inputs.nextDouble();
			System.out.println("Width of the rectangle:");
			wid = inputs.nextDouble();
			
			print(calcPerim(len, wid));
		}
		
		public static double calcPerim(double l, double w)
		{
			return 2 * (l + w);
		}
		
		public static void print(double p)
		{
			System.out.printf("Your rectangle is around %5.5f", p);
		}
	}