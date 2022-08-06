package week1.day1;

public class MyMobile {

	public void typemessages() {
		System.out.println("I am typing message from this method");
	}

	public void makeCalls() {
		System.out.println("I am making calls from this method");
	}
	
	public static void main(String[] args) {
		
		MyMobile m = new MyMobile();
		m.typemessages();
		m.makeCalls();			
	}
}


