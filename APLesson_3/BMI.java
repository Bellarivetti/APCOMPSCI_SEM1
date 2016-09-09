import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner BMI = new Scanner(System.in);
		
		System.out.println("Weight in lbs: ");
		double w = BMI.nextInt();
		
		System.out.println("Height in inches: ");
		double h = BMI.nextInt();
		
		double c = (703 * w)/(h * h);
		
		System.out.println("BMI: " + c + " ... LOL. ");
	}
}