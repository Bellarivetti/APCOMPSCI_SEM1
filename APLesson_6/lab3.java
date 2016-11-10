import java.util.Scanner;

public class lab3

//reverse triangle
{
	public static void main (String[]args) 
	{
		Scanner tj = new Scanner(System.in); 
		
		System.out.println("Desired word: "); 
		
		String W = tj.next(); 
		
		for(int i = W.length(); i > 0; i--)
		{
			System.out.println(W.substring(0,i)); 
			
		}
	}
}