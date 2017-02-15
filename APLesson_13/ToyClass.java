
public abstract class ToyClass

//Lab13 Toy

{
	String name;
	double count;
	
	public ToyClass()
	{
		this.name = "";
		this.count = 1;
	}
	
	public ToyClass(String n)
	{
		this.name = n;
		this.count = 1;
	}

	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(double c)
	{
		this.count = c;
	}

	public String getName()
	{
		return name;
	}
	
	public double getCount()
	{
		return count;
	}

	
	public abstract String getType();

	public String toString()
	{
		return name + "\t...\t" + count;
	}
}