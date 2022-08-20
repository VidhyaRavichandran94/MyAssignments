package week3.day1.java;

public class BankInfo extends AxisBank {
	
	public void  deposit() {
		super.deposit();	
		System.out.println("bank info deposit");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankInfo bank = new BankInfo();
      bank.deposit();
	}

}
