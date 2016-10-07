import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		Ex_04 Volume = new Ex_04();
		
		System.out.println("Height in inches: ");
		double h = tj.nextDouble();
		
		System.out.println("Length in Inches: ");
		double len = tj.nextDouble();
		
		System.out.println("Width in Inches: ");
		double wid = tj.nextDouble();
		
		Double V = Volume.calcV(h, len, wid);
		System.out.println("The volume in cubic ft: "+ V*0.000578704);
	}
	public double calcV(double h, double len, double wid)
	{
		return(h*len*wid);
	}
}