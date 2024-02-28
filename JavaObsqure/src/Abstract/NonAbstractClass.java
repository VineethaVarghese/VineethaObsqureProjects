package Abstract;

public class NonAbstractClass extends AbstractClass{

	public static void main(String[] args) {
		
		NonAbstractClass nb = new NonAbstractClass(); // We can get constructor through this instansiation as well
		nb.method1(); // can get the overriden value of abstract class 
		nb.method2(); // 
		AbstractClass.display(); // for calling static method from parent class
		
		AbstractClass ac = new NonAbstractClass(); // For invoking constructor from  abstract class , we should create parent class obj = new child class
		
	}

	@Override
	public void method1() {
		System.out.println("Overrien Method");
		
	}

}
