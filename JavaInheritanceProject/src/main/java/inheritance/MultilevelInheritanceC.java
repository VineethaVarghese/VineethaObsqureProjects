package inheritance;

public class MultilevelInheritanceC extends MultilevelInheritanceB{

	public void print3()
	{
	 System.out.println("This is Child Class C");
	}
	
	public static void main(String[] args)
	{
		
		MultilevelInheritanceC mc = new MultilevelInheritanceC();
		mc.print();
		mc.print1();
		mc.print3();
	}

}
