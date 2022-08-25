package week3.day2.java;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		String s = "";
		String[]  s1 = text.split(" ");

		for (String s2 : s1) {	
			if (s.contains(s2)) {
				continue;
			}	
			else {
				s=s+" "+s2;
			}

		}

		System.out.println(s.trim());

	}

}
