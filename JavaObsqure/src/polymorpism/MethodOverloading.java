package polymorpism;

public class MethodOverloading {
	
	public void add(int a, int b, int c)
	{
		
		c=a+b+c;
		System.out.println(c);
		
	}
	public void add(String name,int b)
	{
		
		System.out.println(name+" "+b);
		
	}
	public void add(int b ,String name)
	{
		
		System.out.println(name+" "+b);
		
	}
	public int add(int aa, int bb)
	{
		
		return aa+bb;
		
		
	}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(2, 4, 5);
		obj.add("Vini", 50);
		obj.add(20, "World");
		int cc =obj.add(20, 30);
		System.out.println(cc);

	}

}
