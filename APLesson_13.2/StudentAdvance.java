
public class StudentAdvance extends Advance

{
	public StudentAdvance(int dl)
	{
		super(dl);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial No.: " + getSN() + "\nPrice: " + getPrice() + "\nStudent ID Required";
	}
}