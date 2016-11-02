import java.util.Scanner;

public class Ex4
{
	static String res;
	static String BMI;
	
	public static void main(String[]args)
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Input Height in Inches:");
		double h = inp.nextDouble();
		System.out.println("Input Weight in Pounds:");
		double w = inp.nextDouble();
		
		double BMI = (703*w)/(h*h);
		
		System.out.printf("Your BMI is %3.2f", BMI);
		System.out.println("\nYou are: " + resBMI(BMI));
	}
	public static String resBMI(double bmi)
	{
		if (bmi > 39.9)
		{
			res = "Morbidly Obese";
		}
		else if(bmi >= 35)
		{
			res = "Very Obese";
		}
		else if(bmi >= 29.9)
		{
			res = "Obese";
		}
		else if(bmi >= 25)
		{
			res = "Overweight";
		}
		else if(bmi >= 18.5)
		{
			res = "Normal";
		}
		else
		{
			res = "Underweight";
		}
		return res;
	}
}