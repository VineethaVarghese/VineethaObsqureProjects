package agrregation;

public class StudentChild
{
	
	int roll_num;
	String name;
	AddressParent address;
	
	public StudentChild(int roll_num , String name ,AddressParent address )
	{
		this.roll_num = roll_num;
		this.name = name;
		this.address=address;
	}
	
	public void dispaly()
	{
		System.out.println(roll_num);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
	}

	public static void main(String[] args) {
	
		
	  AddressParent ap = new AddressParent("Ernakulam","Kerala","India");
		
	  StudentChild sc = new StudentChild(10,"Vineetha",ap);
	  sc.dispaly();
	}

}
