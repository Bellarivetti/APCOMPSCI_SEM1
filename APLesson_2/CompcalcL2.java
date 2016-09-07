public class CompcalcL2

{
	public static void main(String[]args)
	{
		int l = 4;
		int h = 6;
		int w = 5;
		int hs = w * l + h * l + h * w;
		int sa = 2 * hs;
		
		System.out.println("Surface area of the rectangle is " + sa);
	}
}