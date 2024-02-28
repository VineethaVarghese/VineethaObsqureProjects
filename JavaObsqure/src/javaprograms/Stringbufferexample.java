package javaprograms;

public class Stringbufferexample {

	public static void main(String[] args) {
		
		StringBuffer  sb = new StringBuffer("String");
		sb.append("Integer");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		
		

	}

}
