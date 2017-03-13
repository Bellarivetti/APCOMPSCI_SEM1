
public class Honda extends CarClass

{
	private double coorx, coory;
	
	public Honda()
	{
		coorx = 0;
		coory = 0;		
	}
	
	public Honda(double[] inpcoor)
	{
		coorx = inpcoor[0];
		coory = inpcoor[1];
	}
	
	public void move(double x, double y)
	
	{
		coorx += x;
		coory += y;
	}
	
	public double[] getLocation()
	{
		double location[] = new double[2];
		location[0] = coorx;
		location[1] = coory;
		return location;
	}
	
	public int getID()
	
	{
		return ID;
	}
}
