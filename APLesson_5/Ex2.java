import java.util.Scanner;

public class Ex2
{
	public static void main(String[]args)
	{
		Ex2 receipt = new Ex2();
		Scanner tj = new Scanner(System.in);
		
		System.out.println("Enter item one:");
		String item1 = tj.nextLine();
		System.out.println("Price:");
		double p1 = tj.nextDouble();
		
		tj.nextLine();
		System.out.println("Enter item two:");
		String item2 = tj.nextLine();
		System.out.println("Price:");
		double p2 = tj.nextDouble();
		
		tj.nextLine();
		System.out.println("Enter item three:");
		String item3 = tj.nextLine();
		System.out.println("Price:");
		double p3 = tj.nextDouble();
		
		double subTotal = p1+p2+p3;
		double discounted = subTotal - (discount(subTotal));
		
		System.out.println("<<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>>>\n");
		receipt.printReceipt(item1, p1);
		receipt.printReceipt(item2, p2);
		receipt.printReceipt(item3, p3);
		System.out.println("\n");
		receipt.printReceipt("Subtotal:", subTotal);
		receipt.printReceipt("Discount: ", discount(subTotal));
		receipt.printReceipt("Tax: ", discounted * 0.08);
		receipt.printReceipt("Total:", discounted * 1.08);
		System.out.println("\n________________________________________");
		System.out.println("Thank you");
		
	}
	
		public void printReceipt(String item, double price)
		{		
			System.out.printf("\n %15s ---------\t %5.2f", item, price);
		}
		public static double discount(double total)
		{
			double dis = 0;
			if (total >= 2000)
				dis = total*0.15;
			if (total < 2000)
				dis = 0;
			return dis;
			
		}
}