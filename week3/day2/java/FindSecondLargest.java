package week3.day2.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> values=new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++) {
			values.add(data[i]);			 
		}
		List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(values);
		int count =  list1.size();
		System.out.println(list1);
		System.out.println("second last element from List:"+list1.get(count-2)+"");
	}
}
