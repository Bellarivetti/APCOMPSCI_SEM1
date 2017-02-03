
import java.util.Scanner;

public class Lab6RUN

//Inventory Runner

{
	public static void main(String[]args)
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("item name: ");
		String in = tj.nextLine();
		
		System.out.println("manufacturer: ");
		String m = tj.nextLine();

		System.out.println("Are you entering an item category & price? (yes/no)");
		String response = tj.nextLine();

		if (response.equals("yes"))
		{
			System.out.println("Category: ");
			String c = tj.nextLine();
			System.out.println("Price of Item: ");
			int p = tj.nextInt();

			Lab6 tim = new Lab6(m, in, c, p);
			System.out.println(tim);
		}
		
		if (response.equals("n"))
		{
			Lab6 sev = new Lab6(m, in);
			System.out.println(sev);
		}
	}
}