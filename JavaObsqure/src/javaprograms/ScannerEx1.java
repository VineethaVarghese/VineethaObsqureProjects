package javaprograms;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String Value ");
		String a1 = obj.nextLine();
		System.out.println("Enter the Integer Value ");
		int a = obj.nextInt();
		System.out.println("Enter the Character Value ");
		char c = obj.next().charAt(0);
		

	}

}
