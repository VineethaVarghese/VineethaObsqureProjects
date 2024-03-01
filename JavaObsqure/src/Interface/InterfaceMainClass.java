package Interface;

//Program for multiple inheritance
public class InterfaceMainClass implements InterfaceClass , MultipleInheritance {

	public static void main(String[] args) {
		
		InterfaceMainClass imc = new InterfaceMainClass();
		imc.dispaly();
		imc.display2();
	}

	@Override
	public void dispaly() {
	
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	public void display2() {
		
		int d = a*b;
		System.out.println(d);
		
	}

}
