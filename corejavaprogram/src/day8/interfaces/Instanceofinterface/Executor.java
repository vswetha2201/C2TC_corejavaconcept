package day8.interfaces.Instanceofinterface;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();

	}

}