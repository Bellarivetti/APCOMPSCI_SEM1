import java.util.Scanner;

public class Rectangle

{

	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	
    {
		Scanner tj = new Scanner(System.in);
		System.out.println("Length: ");
		l = tj.nextInt();
		System.out.println("Width: ");
		w = tj.nextInt();
		Cp();
		print();
    }
	public static void Cp()
	{
		p = (2*1 + 2*w);
	}
	
	public static void print()
	{
		System.out.println("Rectangle is " + p + " feet around. ");
	}
	
}