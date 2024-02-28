package encapsulation;

public class UserClass {
	
	private int pinnumber;
	
	public void setUserPin(int pin)
	{
		pinnumber = pin;
		
	}
	
	public void getUserPin()
	{
		if(pinnumber == 1001)  
		{
			System.out.println("Valid Pin");
		}
		else if (pinnumber == 1234)
		{
			System.out.println("Valid Pin");
		}
		else if(pinnumber == 1212)
		{
			System.out.println("Valid Pin");
		}
		else
		{
			System.out.println("Invalid pins");
		}
	  
	}

}
