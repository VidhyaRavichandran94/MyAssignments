package week3.day2.java;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="babu";

		char[] ch = new char[s.length()];

		// Copying character by character into array
		// using for each loop
		for (int i = 0; i <= s.length()-1; i++) {
			ch[i] = s.charAt(i);
		}
		Set<Character> names = new HashSet<Character>();
		for(int j = 0; j <= ch.length-1; j++)
		{
			if (names.contains(ch[j])) {
				names.remove(ch[j]);
			}
			else {
				names.add(ch[j]);
			}
		}
		System.out.println(names);

	}

}
