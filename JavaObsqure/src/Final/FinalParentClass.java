//Program where method with Final keyword cannot be used


package Final;

public class FinalParentClass {
	int a = 10;
	int b = 20;
	
	
	 public final void add()
	 {
     int c = a+b;
	 System.out.println(c);
	 }

}
