import java.util.Scanner;

public class RudeAI

{
	public static void main(String[]args)
	{
		Scanner baby = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String dog = baby.next();
		System.out.println("LMAO! " + dog + " is so weird but it's chill. You live you berh..");

		System.out.println("How old are you?");
		int cat = baby.nextInt();
		System.out.println(cat + " ... WHATTA YOUNGIN'. You probably like dank memes or something too lol.");
		
	
		System.out.println("What do you even do for fun berh?");
		String cow = baby.next();
		System.out.println(cow + " That doesnt sound fun, sorry berh. JK sorry not sorry lmao.");
		
		System.out.println("What kind of music do you like??");
		String pig = baby.next();
		System.out.println("You like " + pig + " ... Thats so weird. If you dont like Flume then we're not friends. ");
		
		System.out.println("How many siblings do you have?");
		int bug = baby.nextInt();
		System.out.println(bug + " Oh that sucks for you lol bruuuzki.");
		
		System.out.println("What do you want to be when you grow up?");
		String rat = baby.next();
		System.out.println("You want to be a " + rat + " ?  Lol goodluck buddy!");
	}
}