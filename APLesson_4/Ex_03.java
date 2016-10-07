import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		double princ = 0;
		double r = 0;
		double t = 0;
		
		double compoundInterest = 0;
		
		System.out.print("Enter the principal Amount: ");
		princ = input.nextDouble();
		
		System.out.print("Enter the rate: ");
		r = input.nextDouble();
		
		System.out.print("Enter the time: ");
		t = input.nextDouble();
		
		compoundInterest = princ * Math.pow((1 + r/100),t);
		
		System.out.println("");
		System.out.println("Your monthly payment is: " + compoundInterest);
	}
}