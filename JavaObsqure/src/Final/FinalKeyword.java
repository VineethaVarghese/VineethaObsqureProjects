//Program where method with Final keyword cannot be used


package Final;


public class FinalKeyword extends FinalParentClass{
	
	public void add()
	{
		
	}
	
	public static void main(String[] args) {
		
		FinalKeyword fk = new FinalKeyword();
		fk.add();
	}

}
