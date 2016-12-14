import java.util.Scanner;

//TreeDeg60

public class Lab_4

{
	public static void main(String[]args)
	
	{
		Scanner tj = new Scanner(System.in);
		System.out.println("Input Word:");
	
		String Wi = tj.nextLine();
		tree(Wi, 0, Wi.length());
	}
	
	public static void tree(String w, int G, int S)
	{
		if (G <= S)
		{
			System.out.printf("%15s\n", w.substring(0, G));
			G++;
			tree(w, G, S);
		}
	}
}