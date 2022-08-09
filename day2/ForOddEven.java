package week1.day2;

public class ForOddEven {

	public static void main(String[] args) {
		
		ForOddEven  obj = new ForOddEven();
		System.out.println("***************Increament For Loop***************************************");
		obj.incrementForLoop();
		
		System.out.println("***************Decreament For Loop***************************************");
		obj.decreamentForLoop();
}

public void incrementForLoop() {
	
	int n=8;
	for(int i=0;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.println("The odd number is given"+i);
		}
		else
		{
			System.out.println("The even number is given"+i);
		}
	}

}




public void decreamentForLoop() {

	int n=8;
	for(int i=n;i>=0;i--)
	{
		if(i%2==0)
		{
			System.out.println("The odd number is given"+i);
		}
		else
		{
			System.out.println("The even number is given"+i);
		}
	}

}

}

	
	

