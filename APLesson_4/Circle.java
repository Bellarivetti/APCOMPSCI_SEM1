import java.util.Scanner;

public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		double radius = 0.0;
		double area = 0.0;
		
		System.out.print("Length of radius: ");
		radius = kb.nextDouble();
		
		area = 3.14159265*(radius*radius);
		
		System.out.println("Area of cirlce is: " + area);
	}
}
