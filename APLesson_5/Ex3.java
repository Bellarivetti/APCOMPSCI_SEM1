import java.util.Scanner;

public class Ex3
{
	static double GPA;
	
	public static void main(String[]args)
	
	{
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("First grade?");
		String g1 = inputs.nextLine();
		
		System.out.println("Second grade?");
		String g2 = inputs.nextLine();
		
		System.out.println("Third grade?");
		String g3 = inputs.nextLine();
		
		System.out.println("Fourth grade?");
		String g4 = inputs.nextLine();
		
		System.out.println("Fifth grade?");
		String g5 = inputs.nextLine();
		
		System.out.println("sixth grade?");
		String g6 = inputs.nextLine();
		
		System.out.println("Seventh grade?");
		String g7 = inputs.nextLine();
		
		double gpa1 = calcPoints(g1);
		double gpa2 = calcPoints(g2);
		double gpa3 = calcPoints(g3);
		double gpa4 = calcPoints(g4);
		double gpa5 = calcPoints(g5);
		double gpa6 = calcPoints(g6);
		double gpa7 = calcPoints(g7);
		
		double totalGPA = (gpa1 + gpa2 + gpa3 + gpa4 + gpa5 + gpa6 + gpa7)/7;
		
		System.out.printf("Your GPA is %4.2f", totalGPA);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return 4.0;
		}
		
		if (grade.equals("B"))
		{
			return 3.0;
		}
		
		if (grade.equals("C"))
		{
			return 2.0;
		}
		
		if (grade.equals("D"))
		{
			return 1.0;
		}
		
		if (grade.equals("F"))
		{
			return 0.0;
		}
		
		else 
			return 0;
	}
}