package week3.day2.java;

import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		int[] a1={3,2,11,4,6,7};
		int[] b1={1,2,8,4,9,7};

		
		
		for(int i=0;i<=a1.length-1;i++)
		{
			a.add(a1[i]);
		}
		
		for(int i=0;i<=b1.length-1;i++)
		{
			b.add(b1[i]);
		}	
		
		for(int i=0;i<=a.size()-1;i++)
		{
			for (int j = 0;j<=b.size()-1;j++)
			{
				 if ((a1[i] == b1[j]))
				 {
					 System.out.println("Duplicate Element : "+a1[i]);				
			}
		}
			
		
	}

	}
}
