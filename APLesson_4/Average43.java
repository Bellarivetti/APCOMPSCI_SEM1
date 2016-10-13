import java.util.Scanner;

public class Average43
{
	public static void main(String[]args) 
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Value one:");
		double num1 = tj.nextInt();
		System.out.println("Value two:");
		double num2 = tj.nextInt();
		System.out.println("Value three:");
		double num3 = tj.nextInt();
		
		double average = avg(num1,num2,num3);
		
		print(num1, num2, num3, average);
		
	}
	public static double avg(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of " + num1 + " , " + num2 + " , and " + num3 + " is %.5f", avg);
	}
}