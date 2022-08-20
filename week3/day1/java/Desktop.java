package week3.day1.java;

public class Desktop extends Computer 
{
	public void desktopSize()
	{
		System.out.println("Desktop Size");
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop call=new Desktop();
		call.computerModel();
		call.desktopSize();
	}

}
