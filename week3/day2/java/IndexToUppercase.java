package week3.day2.java;

public class IndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "changeme";
		String s2="";
		char ch3;
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
			if(i%2==1)
			{
				ch3 = Character.toUpperCase(ch[i]);  
				s2=s2+ch3;
			}
			else {
				s2=s2+ch[i];
			}
		}
		System.out.println(s2);
	}

}
