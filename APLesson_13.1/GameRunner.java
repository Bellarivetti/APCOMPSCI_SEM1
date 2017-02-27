
public class GameRunner

{
	public static void main(String[]args)
	{
		GameSystem objXbox = new Xbox("XBox");
		GameSystem objPS = new Playstation("Play Station");
		GameSystem objPC = new PC("PC");
		
		System.out.println(objXbox);
		System.out.println();
		System.out.println(objPS);
		System.out.println();
		System.out.println(objPC);
		System.out.println();
	}
}