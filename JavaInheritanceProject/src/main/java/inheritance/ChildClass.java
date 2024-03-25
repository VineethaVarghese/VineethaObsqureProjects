package inheritance;

public class ChildClass extends ParentClass{

	public void display()
	{
	System.out.println("Child class");
	}
	public static void main(String[] args) {
		
		ChildClass ob = new ChildClass();//
		ob.display();
		ob.print();
		ob.add();
		

	}

}
