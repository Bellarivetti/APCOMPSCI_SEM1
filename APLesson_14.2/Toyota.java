
import java.util.ArrayList;
import java.util.Arrays;

public class Toyota extends CarClass

{	
	
	private double coorx, coory;
	
	public Toyota(String inp)
	{
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		coorx = Double.parseDouble(coorz.get(0));
		coory = Double.parseDouble(coorz.get(1));
	}
		
	public void move(double x, double y)
	
	{
		coorx += x;
		coory += y;
	}
	
	public double[] getLocation()
	{
		double[] location = new double[2];
		location[0] = coorx;
		location[1] = coory;
		return location;
	}
	
	public int getID()
	
	{
		return ID;
	}
}