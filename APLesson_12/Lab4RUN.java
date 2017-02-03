import java.util.Scanner;

public class Lab4RUN

//Human Runner

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("hair:");
		String ihair = tj.nextLine();
		
		System.out.println("eyes:");
		String ieyes = tj.nextLine();
		
		System.out.println("Gender:");
		String igender = tj.nextLine();
		
		System.out.println("skin:");
		String iskin = tj.nextLine();

		Lab4 obj = new Lab4("black", "brown", "female", "tan");
		System.out.println("Myself:");
		System.out.println("Hair:\t" + obj.getHair());
		System.out.println("Eyes:\t" + obj.getEyes());
		System.out.println("Gender:\t" + obj.getGender());
		System.out.println("Skin:\t" + obj.getSkin());

		obj.setAttributes(ihair, ieyes, igender, iskin);
		System.out.println("\nO info:");
		System.out.println("Hair:\t" + obj.getHair());
		System.out.println("Eyes:\t" + obj.getEyes());
		System.out.println("Gender:\t" + obj.getGender());
		System.out.println("Skin:\t" + obj.getSkin());
	}
}
