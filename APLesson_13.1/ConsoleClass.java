
public abstract class ConsoleClass extends GameSystem

{
	public ConsoleClass()
	{
		super();
	}
	
	public ConsoleClass(String n)
	{
		super(n);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPF() + "\nSerial #: " + super.getSN() + "\nController: " + getController();
	}
}