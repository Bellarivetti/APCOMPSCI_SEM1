import java.util.Scanner;

public class Ex1
{
	public static void main (String[]args)
	{
		int yR = (int)((Math.random()* 6 + 1));
		int cR = (int)((Math.random()* 6 + 1));
		String winner = rollDice(yR, cR);
		System.out.println("You rolled a " + yR);
		System.out.println("Computer rolled a " + cR);
		System.out.println(" " + winner);
	}
	public static String rollDice(int yR, int cR)
	{
		if(yR > cR)
			return "Winner is you!";
		else
			return "Winner is computer!";
	}
}