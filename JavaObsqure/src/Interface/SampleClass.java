
//Program for multilevel inheritance
package Interface;

public class SampleClass implements MultipleInheritance {

	public static void main(String[] args) {
		
		SampleClass sc= new SampleClass();
		sc.dispaly();
		sc.display2();
		
		MultipleInheritance obj = new SampleClass(); // Interfacename obj = new newclassname
		obj.dispaly();

	}

	@Override
	public void dispaly() {
		
		System.out.println("Hellow");
		
	}

	@Override
	public void display2() {

		System.out.println("World");
		
	}

}
