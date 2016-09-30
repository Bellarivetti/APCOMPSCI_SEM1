import java.util.Scanner;

public class Subwoofer
{

   public static void main(String[]args) 
   {
      Scanner input = new Scanner(System.in);
	  Subwoofer boom = new Subwoofer();

      double height = 0;
      double length = 0;
      double width = 0;

      double volume = 0;
  
      System.out.print("Enter the height: "); 
      height = input.nextDouble();

      System.out.print("Enter the length: "); 
      length = input.nextDouble();

      System.out.print("Enter the width: "); 
      width = input.nextDouble();

      volume = height * length * width; 
	 double volume1 = boom.volume1(volume);
  
      System.out.println("");
      System.out.println("The volume is  "+ volume+ " cubic inches");
	  System.out.println("The volume in cubic feet is "+ volume1);
	
   }
	public double volume1 (double volume){	
	return(volume * 0.00057870);
	}
}