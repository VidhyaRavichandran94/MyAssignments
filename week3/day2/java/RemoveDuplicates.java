package week3.day2.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "paypal india";
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		Set<Character> charset = new HashSet<Character>();
		Set<Character> duplicateSet = new HashSet<Character>();
		for(int j = 0; j <= ch.length-1; j++)
		{
			if (charset.contains(ch[j])) {
				duplicateSet.add(ch[j]);
				charset.remove(ch[j]);
			}
			else {
				charset.add(ch[j]);

			}
		}

		for (Character character : charset) {
			
			if (!character.equals(' ')){

			System.out.println("CharacterSet Values:"+character);
			}
		}

	}
}

