
import java.lang.Math;

public abstract class GameSystem

{
	private String PF;
	private int SN;
	
	public GameSystem()
	{
		this.PF = "";
		this.SN = (int)(Math.random() * 10000000) + 1; 
	}
	
	public GameSystem(String p)
	{
		this.PF = p;
		this.SN = (int)(Math.random() * 10000000) + 1; 
	}

	public void setPF(String p)
	{
		this.PF = p;
	}
	
	public void getSN(int sn)
	{
		this.SN = sn;
	}

	public abstract String getPF();
	
	public int getSN()
	{
		return SN;
	}

	public String toString()
	{
		return PF + "..." + SN;
	}
}