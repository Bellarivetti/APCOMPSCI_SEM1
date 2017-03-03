
public class TicketDriver

{
	public static void main(String[]args)
	{
		TicketSC objAdvDiscount = new Advance(15);
		TicketSC objAdvNDiscount = new Advance(5);
		TicketSC objStudentAdv = new StudentAdvance(15);
		TicketSC objWalkup = new Walkup();
		
		System.out.println("Advance Ticket with discount *fifteen days prior*.");
		System.out.println(objAdvDiscount);
		
		System.out.println();
		
		System.out.println("Advance Ticket without discount *five days prior*.");
		System.out.println(objAdvNDiscount); 
		
		System.out.println();
		
		System.out.println("Student Advance Ticket with discount.");
		System.out.println(objStudentAdv);
		
		System.out.println();
		
		System.out.println("Walkup Ticket.");
		System.out.println(objWalkup);
		
	}
}