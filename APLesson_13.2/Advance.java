
public class Advance extends TicketSC

{
	private int daysL;
	
	public Advance(int dl)
	
	{
		super();
		daysL = dl;
	}
	
	public double getPrice()
	{
		if (daysL >= 10)
		{
			return 30.00;
		}
		
		else
		{
			return 40.00;
		}
		
	}
}