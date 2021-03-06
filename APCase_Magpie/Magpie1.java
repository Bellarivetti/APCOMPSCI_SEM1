
public class Magpie1

{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello... let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	
	{
		String response = "";
		
		if (statement.length() == 0)			
		{
			System.out.println("Say something, please.");
		}

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */


		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		else if (findKeyword(statement, "No.") >= 0)			
		{
			response = "Why are you so negative?";
		}
	

		else if (findKeyword(statement, "Mother") >= 0
				|| findKeyword(statement, "Father") >= 0
				|| findKeyword(statement, "Sister") >= 0
				|| findKeyword(statement, "Brother") >= 0)
		
		{
			response = "Tell me more about your family.";
		}
		
		else if (findKeyword(statement, "Cat") >= 0
				|| findKeyword(statement, "Dog") >= 0
				|| findKeyword(statement, "Fish") >= 0
				|| findKeyword(statement, "Horse") >= 0)
		
		{
			response = "Tell me more about your pet.";	
		}
		
		else if (findKeyword(statement, "Robinette") >= 0)			
		{
			response = "He sounds like a pretty wannabe dank teacher.";	
		}
		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */

		else	
		{
			response = getRandomResponse();
		}
		return response;
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	
	{
		String phrase = "";
		phrase = statement.toLowerCase().trim();
		
		int psn = 0;
		psn = phrase.indexOf(goal, startPos);
		
		if (psn >= 0)
		{
			String before = "";
			String after = "";
			
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}
			
			if ((before.compareTo("a") < 0 || before.compareTo("z") > 0) && (after.compareTo("a") < 0 || after.compareTo("z") > 0))
			{
				return psn;
			}
			
			else
			{
				return findKeyword(phrase, goal, psn + 1);
			}
		}
		
		return -1;
		}
					
	
	private int findKeyword(String statement, String goal)
	
	{
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	 
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
		
	}
}