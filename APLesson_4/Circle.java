import java.util.Scanner;

public class Circle
{
	public static void main(String[]args)
	{
		Scanner br = new Scanner(System.in);
		
		double rad = 0.0;
		double area = 0.0;
		
		System.out.print("Radius' Length: ");
		rad = br.nextDouble();
		
		area = 3.14159265*(rad*rad);
		
		System.out.println("Circle's area: " + area);
	}
}
