package week3.day2.java;

public class Iphone implements Mobile{


	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Send SMS");
	}

	public void dialNumber() {
		// TODO Auto-generated method stub
		System.out.println("Dial Number");
	}

	public void switchon() {
		// TODO Auto-generated method stub
		System.out.println("Switch On");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone p=new Iphone();
		p.sendSMS();
		p.dialNumber();
		p.switchon();
		

	}

}
