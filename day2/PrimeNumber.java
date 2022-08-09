package week1.day2;

public class PrimeNumber{    
	public static void main(String args[]){         
		int n=17;   
		boolean flag=false;
			for(int i=2;i<=n/2;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");
					flag=true;
					break;
					}
		}
			if(flag==false){
				System.out.println(n+" is prime number");
			}
			
	}    
	
}
