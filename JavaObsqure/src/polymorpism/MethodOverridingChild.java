package polymorpism;

public class MethodOverridingChild extends MethodOverridingParent {
	
	public void display()
	{
		System.out.println("World");
	}

	public static void main(String[] args)
	{
		
		MethodOverridingParent mp = new MethodOverridingParent();
		mp.display(); // In method overriding , whichever class is creating the obj , that particular class values will only be printed
		
		MethodOverridingChild mc = new MethodOverridingChild();
		mc.display(); //Child object prints child class statements
	
	}

}
 