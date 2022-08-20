package week3.day1.java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Vidhya";
		String rev="";
		char[] charArray=word.toCharArray();
		for(int j=charArray.length-1;j>=0;j--)
		{
			rev=rev+charArray[j];
		}
		System.out.println(rev);
		}
}

	

