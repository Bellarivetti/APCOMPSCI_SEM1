
public class Lab4

//Human

{
	private String hair, eyes, gender, skin;

	public Lab4()
	{
		hair = "";
		eyes = "";
		skin = "";
		gender = "";
	}

	public Lab4(String h, String e, String g, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
		gender = g;
	}

	public void setAttributes(String h, String e, String g, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
		gender = g;
	}

	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getSkin()
	{
		return skin;
	}
	
}
