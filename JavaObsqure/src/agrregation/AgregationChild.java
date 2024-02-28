package agrregation;

public class AgregationChild {
	
	int a;
	AgreegationParent ref;
	
	public  AgregationChild(int a,AgreegationParent ref)
	{
	this.a=a;
	this.ref = ref;
	
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(ref.x);
	}

	public static void main(String[] args) {
		
		AgreegationParent ap = new AgreegationParent(5);
		AgregationChild ac = new AgregationChild(10,ap);
		ac.display();

	}

}
