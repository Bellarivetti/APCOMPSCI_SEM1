import java.lang.Math.*;

public class Lab2

//Distance

{
	private int xO, yO, xT, yT;
	private double distance;

	public Lab2()
	{
		xO = 0;
		xT = 0;
		yO = 0;
		yT = 0;
		distance = 0;
	}

	public Lab2(int x1, int y1, int x2, int y2)
	{
		xO = x1;
		yO = y1;
		xT = x2;
		yT = y2;
		distance = 0;
	}

	
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xO = x1;
		yO = y1;
		xT = x2;
		yT = y2;
	}

	
	public int getX1()
	{
		return xO;
	}
	
	public int getY1()
	{
		return yO;
	}
	
	public int getX2()
	{
		return xT;
	}
	
	public int getY2()
	{
		return yT;
	}
	
	public double getDistance()
	{
		return Math.sqrt((xT-xO)*(xT-xO) + (yT-yO)*(yT-yO));
	}
}
