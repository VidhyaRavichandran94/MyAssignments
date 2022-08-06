package week1.day1;

public class FriendMobile {
	
	public void takePictures() {
		System.out.println("I am Takings Pictures from this method");
	}

	public void makeTransactions() {
		System.out.println("I am Making Transactions from this method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMobile m = new MyMobile();
		m.typemessages();
		m.makeCalls();	
		
		FriendMobile n = new FriendMobile();
		n.takePictures();
		n.makeTransactions();	

	}
	
	

}
