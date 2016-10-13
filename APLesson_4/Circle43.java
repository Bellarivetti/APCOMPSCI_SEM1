import java.util.Scanner;

public class Circle43
	{
		static double r;
		static double area;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("Radius of the circle?");
			r = inputs.nextDouble();
			
			print(calcArea(r));
		}
		
		public static double calcArea(double r)
		{
			return 3.14159 * r * r;
		}
		
		public static void print(double area)
		{
			System.out.printf("The area of a circle with a radius of " + r + " is %5.5f", area);
		}
	}