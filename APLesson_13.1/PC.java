
public class PC extends GameSystem

{
	public PC()
	{
		super();
	}
	public PC(String n)
	{
		super(n);
	}
	public String SystemInput()
	{
		return "Keyboard and mouse";
	}
	public String getPF()
	{
		return "PC";
	}
	
	public String toString()
	{
		return "Platform: " + getPF() + "\nSerial #: " + super.getSN() + "\nSystem Input: " + SystemInput();
	}
}