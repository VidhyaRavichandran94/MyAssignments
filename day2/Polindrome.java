package week1.day2;

public class Polindrome {
	
	public static void main(String[] args) {
		String a = "madam";
		String c = "";
		for(int i=(a.length())-1; i>=0;i--){  
	       c = c + a.charAt(i);  
		}
		if (c.equals(a)) {
			System.out.println("Given word is Polidrome: "+a);
		}
		else {
			System.out.println("Given word is not Polidrome: "+a);
		}
		
	}

}
