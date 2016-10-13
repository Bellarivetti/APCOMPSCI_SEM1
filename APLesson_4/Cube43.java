import java.util.Scanner;

public class Cube43
	{
		static double side;
		static double sA;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("What is the length of a side?");
			side = inputs.nextDouble();
			
			print(calcSurf(side));
		}
		
		public static double calcSurf(double s)
		{
			return 6 * s * s;
		}
		
		public static void print(double sA)
		{
			System.out.printf("The surface area of a cube whose sides are " + side + " is %5.5f", sA);
		}
	}