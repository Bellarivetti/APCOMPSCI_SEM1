
import java.util.Scanner;

public class Lab3RUN

//CarRunner

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Color:");
		
		String icolor = tj.nextLine();
		System.out.println("Interior:");
		
		String iinterior = tj.nextLine();
		System.out.println("Engine:");
		
		String iengine = tj.nextLine();
		System.out.println("Tyres:");
		
		String ityres = tj.nextLine();

		Lab3 obj = new Lab3(icolor, iinterior, iengine, ityres);
		
		System.out.println("Your vehicle is ready...");
		System.out.println("Paint:\t\t" + obj.getColor());
		System.out.println("Interior:\t\t" + obj.getInterior());
		System.out.println("Engine:\t\t" + obj.getEngine());
		System.out.println("Tires:\t\t" + obj.getTyres());
	}
}
