
public class Lab3

//Car
{
	private String color, interior, engine, tyres;

	public Lab3()
	{
		color = "";
		interior = "";
		engine ="";
		tyres = "";
	}

	public Lab3(String c, String i, String e, String t)
	{
		color = c;
		interior = i;
		engine = e;
		tyres = t;
	}

	public void setcer(String c, String i, String e, String t)
	{
		color = c;
		interior = i;
		engine = e;
		tyres = t;		
	}

	public String getColor()
	{
		return color;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTyres()
	{
		return tyres;
	}
}
