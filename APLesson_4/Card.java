import java.util.Scanner;
public class Card
{
	public static void main(String[]args)
	{
		Card form = new Card();
		Scanner ID = new Scanner(System.in);
	
	
		System.out.println("Enter your first name:");
		String cat1 = ID.nextLine();
	
		System.out.println("Enter your last name:");
		String item2 = ID.nextLine();
	
		System.out.println("Enter your 'title':");
		String cat3 = ID.nextLine();
		
		System.out.println("Enter your school address:");
		String item4 = ID.nextLine();
	
		System.out.println("Enter your school year:");
		String cat5 = ID.nextLine();
	
		System.out.println("Enter your subject:");
		String item6 = ID.nextLine();
	
		System.out.println("***********************************");
		
		form.Card(item4, cat5);
		form.Card(cat1, item2);
		form.Card(cat3, item6);
		
		System.out.println("\n***********************************");
		
}

	public void Card(String item, String cat)
	{
		System.out.printf("\n%10s  %10s", item, cat);
	}
}