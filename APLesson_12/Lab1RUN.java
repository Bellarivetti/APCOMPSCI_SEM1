import java.util.Scanner;

public class Lab1RUN

//MPH Runner

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("disance in miles: ");
		int dis = tj.nextInt();
		
		System.out.println("hours: ");
		int hours = tj.nextInt();
		
		System.out.println("minutes: ");
		int min = tj.nextInt();

		Lab1 obj = new Lab1(10, 2, 0);

		System.out.println(obj.getdis() + " miles in " + obj.gethours() + " hours and " + obj.getmin() + " minutes is " + obj.getMPH() + " MPH");

		obj.setValues(dis, hours, min);

		System.out.println("\nUser Input:");
		
		System.out.println(obj.getdis() + " miles in " + obj.gethours() + " hours and " + obj.getmin() + " minutes is " + obj.getMPH() + " MPH");
	}
}
