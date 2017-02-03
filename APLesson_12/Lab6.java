
import java.lang.Math;

public class Lab6

//Inventory

{
	private String manufacturor, ne, category;
	private int price;
	private long UPC;

	public Lab6()
	{
		manufacturor = "";
		ne = "";
		category = "";
		UPC = 0;
		price = 0;
	}

	public Lab6(String man, String n)
	{
		manufacturor = man;
		ne = n;
		category = "Udefined.";
		price = 0;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}

	public Lab6(String man, String n, String cat, int p)
	{
		manufacturor = man;
		ne = n;
		category = cat;
		price = p;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}

	public String toString()
	{
		return "\nLab6 Items..." +
							"\nItem ne: " + ne +
							"\nmanufacturor: " + manufacturor +
                            "\nCategory: " + category +
                            "\nUPC No.: " + UPC +
							"\nPrice: " + price;
	}

	public String getmanufacturor()
	{
		return manufacturor;
	}
	
	public String getne()
	{
		return ne;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public long getUPC()
	{
		return UPC;
	}
	
	public int getPrice()
	{
		return price;
	}
}
