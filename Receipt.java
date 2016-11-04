import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		Scanner tj = new Scanner(System.in);
		
		System.out.println("Enter Item 1:");
		String item1 = tj.next();
		System.out.println("Enter Price");
		double price1 = tj.nextDouble();
		
		System.out.println("Enter Item 2:");
		String item2 = tj.next();
		System.out.println("Enter Price");
		double price2 = tj.nextDouble();
		
		System.out.println("Enter Item 3:");
		String item3 = tj.next();
		System.out.println("Enter Price");
		double price3 = tj.nextDouble();
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		double total = price1 + price2 + price3;
		form.format("S.Total", total);
		
		double price4 = total * .1;
		String item4 = "Tax";
		
		form.format(item4, price4);
		
		double price5 = price4 + total;
		String item5 = ("Total");
		form.format(item5, price5);
		
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%20s %20.2f", item, price);
	}
	
}