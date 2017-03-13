
public abstract class CarClass implements Location

{
	int ID;
	
	public CarClass()
	
	{
		ID = (int)(Math.random() * 999999) + 1;
	}

}