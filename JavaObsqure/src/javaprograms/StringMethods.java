package javaprograms;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = new String("Examination");
		String s1 = new String("Examination");
		String s2 = new String("Examilnation");
		String s3 = new String("Keltron");
		String s4 = new String("How was your was with");
		
		
		//CharAt()
		char ch = s.charAt(3);
		System.out.println(ch);
		
		//compareTo()
		System.out.println(s.compareTo(s1));//0 because both are equal  
		System.out.println(s.compareTo(s2));//since n is two number greater than l
		System.out.println(s.compareTo(s3));//-6 since E is less than K	
		
		//concat
		String s5 = s4.concat(" ").concat(s1);
		String s6= s4.concat("@").concat(" ").concat(s1);
		System.out.println(s5);
		System.out.println(s6);
		
		//equals
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		
		//contains
		System.out.println(s4.contains("was"));
		System.out.println(s4.contains("day"));
		
		//indexOf()
		int index1 =s4.indexOf("was");
		System.out.println(index1);// 0123(space) after that fourth letter
		int index2 =s4.indexOf("y");
		System.out.println(index2);// 123(space)4567(space) after that 8 th position
		int index3 =s4.indexOf("was",10);//returns the index of was substring after 10th index  
		System.out.println(index3);
		
		//isEmpty()
		String aa = "";
		String aa1 = "World";
		System.out.println(aa.isEmpty()); // return true since the number of character is empty
		System.out.println(aa1.isEmpty());// return false since the number of character is not empty
		
		//length()
		System.out.println("Length of String :"+aa1.length());
		
		//replace()
		String strReplace = aa1.replace('o', 's');
		System.out.println(strReplace);//replaces the letter o with s
		
		//replaceAll()
		
		//substring()
		
		//toLowerCase()
		String ss = "MALAYALAM";
		System.out.println(ss.toLowerCase());
		
		//toUpperCase
		String ss1 = "malayalam";
		System.out.println(ss.toUpperCase());
		
		//trim
		String tr = " String  trim method ";
		System.out.println(tr);//without using trim method
		System.out.println(tr.trim());//it trims the spaces in the beginning and end and dosen't trim the space inbetween
	
		//valueOf()
		int value=30;  
		String st1=String.valueOf(value);  
		System.out.println(st1+10);
		
		// Boolean to String  
        boolean bol = true;    
        boolean bol2 = false;    
        String st3 = String.valueOf(bol);    
        String st4 = String.valueOf(bol2);  
        System.out.println(st3);  
        System.out.println(st4);  
        
     // char to String         
        char ch1 = 'A';    
        char ch2 = 'B';  
        String st5 = String.valueOf(ch1);    
        String st6 = String.valueOf(ch2);  
        System.out.println(st5);  
        System.out.println(st6);  
        
        float f  = 10.05f;    
        double d = 10.02;  
        String st7 = String.valueOf(f);    
        String st8 = String.valueOf(d);  
        System.out.println(st7);  
        System.out.println(st8);  
		
		
   }
} 