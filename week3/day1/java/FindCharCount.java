package week3.day1.java;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Testleaf";
		char c='a';
		int count=0;
		char[] charArray=word.toCharArray();
		for(int j=0;j<=charArray.length-1;j++)
		{
			if(charArray[j]==c) {
				count=count+1;
				
			}
			
		}
		System.out.println("character "+c+" count is "+count+"");
	}
}

	

