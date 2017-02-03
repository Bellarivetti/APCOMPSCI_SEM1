import java.util.Scanner;

public class Lab2RUN

//Distance Runner

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("x-coordinate of 1st point:");
		int xin1 = tj.nextInt();
		
		System.out.println("y-coordinate of 1st point:");
		int yin1 = tj.nextInt();
		
		System.out.println("x-coordinate of 2nd point:");
		int xin2 = tj.nextInt();
		
		System.out.println("y-coordinate of 2nd point:");
		int yin2 = tj.nextInt();

		Lab2 obj = new Lab2(5, 7, 9, 0);

		System.out.println("Distance between (" + obj.getX1() + ", " + obj.getY1() + ")and the point (" + obj.getX2() + ", " + obj.getY2() +") is " + obj.getDistance());

		obj.setCoordinates(xin1, yin1, xin2, yin2);
		System.out.println("\nUser Inputs:");
		System.out.println("Distance between (" + obj.getX1() + ", " + obj.getY1() + ")and the point (" + obj.getX2() + ", " + obj.getY2() +") is " + obj.getDistance());
	}
}