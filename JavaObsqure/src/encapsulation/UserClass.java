package encapsulation;

public class UserClass {
	
	private int pinnumber;
	private int x = 1001;
	private int y = 1234;
	private int z = 1212;
	
	public void setUserPin(int pin)
	{
		this.pinnumber = pin;
		
	}
	public void validate()
	{
		if(pinnumber == x)  
		{
			System.out.println("Valid Pin");
		}
		else if (pinnumber == y)
		{
			System.out.println("Valid Pin");
		}
		else if(pinnumber == z)
		{
			System.out.println("Valid Pin");
		}
		else
		{
			System.out.println("Invalid pins");
		}
	}
	
	public void getUserPin()
	{
		System.out.println("User Pin Number is "+pinnumber);
		
	}

}
