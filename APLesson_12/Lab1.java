import java.lang.Math.*;

public class Lab1

//MPH

{
	private int dis, hours, min;
	private double MPH;

	public Lab1()
	{
		dis = 0;
		hours = 0;
		min = 0;
		MPH = 0;
	}

	public Lab1(int distance, int hou, int mins)
	{
		dis = distance;
		hours = hou;
		min = mins;
		MPH = 0;
	}

	public void setValues(int distance, int hou, int mins)
	{
		dis = distance;
		hours = hou;
		min = mins;
		MPH = 0;
	}

	public int getdis()
	{
		return dis;
	}
	public int gethours()
	{
		return hours;
	}
	public int getmin()
	{
		return min;
	}

	public double getMPH()
	{
		return (dis/(hours + (min / 60.0)));
	}
}