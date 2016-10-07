import java.util.Scanner;

public class Cube

{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Side length: ");
		side = tj.nextInt();
		
		cA();
		print();
	}
	public static void cA()
	{
		sa = 6*side*side;
	}
	
	public static void print()
	{
		System.out.println("Cube's surface area: " + sa );
	}
}
