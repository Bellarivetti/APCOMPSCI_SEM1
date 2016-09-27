import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		double principal = 0;
		double rate = 0;
		double time = 0;
		
		double compoundInterest = 0;
		
		System.out.print("Enter the principal Amount: ");
		principal = input.nextDouble();
		
		System.out.print("Enter the rate: ");
		rate = input.nextDouble();
		
		System.out.print("Enter the time: ");
		time = input.nextDouble();
		
		compoundInterest = principal * Math.pow((1 + rate/100),time);
		
		System.out.println("");
		System.out.println("Your monthly payment is: " + compoundInterest);
	}
}