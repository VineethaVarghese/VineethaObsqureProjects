package encapsulation;

public class UserMainClass {

	public static void main(String[] args) {
		
		UserClass uc = new UserClass();
		
		uc.setUserPin(1001);
		uc.validate();
		//uc.setUserPin(1234);
		//uc.setUserPin(1212);
		//uc.setUserPin(1233);
		uc.getUserPin();
	}

}
