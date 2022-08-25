package week3.day2.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,1,2,5, 6,7,4,9};
		Set<Integer> values=new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++) {
			values.add(data[i]);			 
		}
		List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(values);
		int temp=0;
		
		for(int i=1;i<=list1.size()-1;i++) {
			if(list1.get(i)-list1.get(i-1)==1) {
				continue;
			}
			
			else {
				int missing_number=list1.get(i)-1;
				System.out.println("Missing Number:"+missing_number+"");
				
		}
		
		}
		
	}
	
}
		
