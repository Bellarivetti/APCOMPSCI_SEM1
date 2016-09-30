import java.util.Scanner;
public class Average
{
	static double b;
	static double c;
	static double d;
	static double a;
	
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First number: ");
		b = kb.nextInt();
		
		System.out.println("Next number: ");
		c = kb.nextInt();
		
		System.out.println("Last number: ");
		d = kb.nextInt();
		calcAvg();
		print();
	
	}
	public static void calcAvg()
	{
		a = (b + c +d)/3;
	}
	public static void print()
	{
		System.out.println("Average is: " + a);
	}
	
}