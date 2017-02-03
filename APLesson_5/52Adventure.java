import java.util.*;

public class 52Adventure
{
	public static void main(String[]args)
	{
		Scanner UserInput = new Scanner(System.in);
		
		System.out.println("You found a purple unicorn...");
		System.out.println("You fed the unicorn a carrot...");
		System.out.println("You found a blue unicorn nearby eating an apple");
		System.out.println("You decided to steal the blue unicorn's apple");
		System.out.println("Option A: Give the blue unicorn's apple back.");
		System.out.println("Option B: Give the blue unicorn's apple to the purple unicorn.");
		System.out.println("Option C: You slay the blue unicorn");
		System.out.println("Please choose your Option: [Enter: A, B, or C]");
		String Input1 = UserInput.next();
		
		if(Input1.equals("A"))
			dog();
		if(Input1.equals("B"))
			cat();
		if(Input1.equals("C"))
			pig();
	}
	
	public static void dog()
	
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("You decided to give the apple back to the blue unicorn...");
		System.out.println("The blue unicorn is mad at you for stealing it in the first place!");
		System.out.println("You are unsure how to deal with the situation...");
		
		System.out.println("Option A: Take the heat and walk away.");
		System.out.println("Option B: Take the apple back from the blue unicorn because it was rude.");
		
		String Input1 = UserInput.next();
		
		if(Input1.equals("A"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to take the blue unicorn's heat");
			System.out.println("You walk away after saying sorry...");
		}
		
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to take the apple back from the blue unicorn");
			System.out.println("You are now a mortal enemy of the blue unicorn.");
		}
	}
	
	public static void cat()
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("You decided to give the blue unicorn's apple to the purple unicorn.");
		System.out.println("You are now best friends with the purple unicorn!");
		System.out.println("You are unsure how to deal with this news.");
		
		System.out.println("Option A: Become the purple unicorn's lifelong companion.");
		System.out.println("Option B: Leave the purple unicorn for the blue unicorn because it's a prettier animal.");
		
		String Input1 = UserInput.next();
		
		if(Input1.equals("A"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to become the purple unicorn's lifelong companion!");
			System.out.println("Day after day you have become close.");
			System.out.println("You confess your happiness and joy.");
			System.out.println("The blue unicorn is high-key jealous.");
			
		}
		
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to leave the purple unicorn for the blue unicorn...");
			System.out.println("The blue unicorn confessed to having a crush on you since the day you took the apple.");
			System.out.println("Youre not sure how this is working out...");
			System.out.println("You wonders if you should be a lone unicorn with no bae.");
			
		}
	}
	
	public static void pig()
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("You decide to sneak away from the blue unicorn because she was too clingy.");
		System.out.println("You are unsure what to do!");
		System.out.println("Option A: Get with the black unicorn.");
		System.out.println("Option B: Become a loner.");
		String Input1 = UserInput.next();
		if(Input1.equals("A"))
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You decided to slide in the black unicorn's DM's!");
			System.out.println("ooooooo so sleek.");
			System.out.println("You feel like things are going well!");
			System.out.println("You wonders how you should ask him to lunch.");
			System.out.println("Option A: Slide in those DM's some more.");
			System.out.println("Option B: Actually ask via telephone call.");
			
			String Input2 = UserInput.next();
			
			if(Input2.equals("A"))
			{
				System.out.println("You slid in the black unicorn's DM's!");
				System.out.println("He now thinks you're weird because you only DM.");
			}
			else
				System.out.println("You called him over the phone.");
				System.out.println("He thinks you're very kind and polite.");
		}
		else
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("You and the black unicorn go on a nice date!");
			System.out.println("Munch munch munch - you and the black unicorn ate a bunch of apples!");
			System.out.println("You wonder how you should go home!");
			System.out.println("Option A: Walk around the mountain.");
			System.out.println("Option B: Gallop the plains");
			
			String Input3 = UserInput.next();
			
			if(Input3.equals("A"))
			{
				System.out.println("You walked around the mountain and broke your leg.");
				System.out.println("Rip...");
			}
			
			else
				System.out.println("You ran with a herd of other unicorns and got more DM's!");
				System.out.println("You went home and kissed the purple unicorn.");
		}
	}
}