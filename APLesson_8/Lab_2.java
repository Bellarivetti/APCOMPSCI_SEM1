import java.util.Scanner;

//Center

public class Lab_2

{
	public static void main(String[]args)
	
	{
		Scanner tj = new Scanner(System.in);
		
		System.out.println("First Word:");
		String w1 = tj.nextLine();
		
		System.out.println("Second Word:");
		String w2 = tj.nextLine();
		
		System.out.println("Third Word:");
		String w3 = tj.nextLine();
		
		System.out.println(mC(w1));
		System.out.println(mC(w2));
		System.out.println(mC(w3));
		
	}
	public static String mC(String w)
	{
		if (w.length() >= 20)
		{
			return w;
		}
		else
		{
			return mC(" " + w + " ");
		}
	}
}