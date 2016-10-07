import java.util.Scanner;

public class Subwoofer
{

   public static void main(String[]args) 
   {
      Scanner input = new Scanner(System.in);
	  Subwoofer boom = new Subwoofer();

      double h = 0;
      double len = 0;
      double wid = 0;

      double vole = 0;
  
      System.out.print("Enter the height: "); 
      h = input.nextDouble();

      System.out.print("Enter the length: "); 
      len = input.nextDouble();

      System.out.print("Enter the width: "); 
      wid = input.nextDouble();

      vole = h * len * wid; 
	 double vole1 = boom.vole1(vole);
  
      System.out.println("");
      System.out.println("The volume is  "+ vole+ " cubic inches");
	  System.out.println("The volume in cubic feet is "+ vole1);
	
   }
	public double vole1 (double vole){	
	return(vole * 0.00057870);
	}
}