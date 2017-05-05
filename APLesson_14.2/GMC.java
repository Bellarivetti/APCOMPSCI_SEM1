
public class GMC extends CarClass

{
	private double coorx, coory;
	

	public GMC(double x, double y)
	{
		coorx = x;
		coory = y;
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