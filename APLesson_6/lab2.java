import java.util.Scanner;

public class lab2

//factorial 
{	
	public static void main(String[]args)
	{
		Scanner tjinput = new Scanner(System.in);
		
		System.out.println("Input Integer:");
		
		int fNum = tjinput.nextInt();
		
		System.out.println(calcF(fNum));
	
	}
	public static int calcF(int fNum)
	{
		int f = 1;
		for (int i = 1; i <= fNum; i++)
		{
			f = f * i;
		}
		return f;
	}
}