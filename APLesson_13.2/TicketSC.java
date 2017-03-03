
public abstract class TicketSC

{
	private int serialNo;

	public TicketSC()
	{
		serialNo = 0;
	}
	
	public int getSN()
	{
		return (int)(Math.random() * 10000000) + 1; 
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial No.: " + getSN() + "\nPrice: " + getPrice();
	}
}