package week3.day1.java;

public class Overloading {
	 static int add(int a,int b, int c) 
	 {
		 return a+b+c;
		 }  
	static double add(double a,double b)
	{
		return a-b;
		}
	 static float add(float a,float b) 
	 {
		 return a*b;
		 }  
	static int add(int a,int b)
	{
		return a/b;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading overload=new Overloading();
		System.out.println(overload.add(11,15,54));  
		System.out.println(overload.add(12.05, 11.89));
		System.out.println(overload.add(11.5f,2.5f));  
		System.out.println(overload.add(50,2));
	}
		

}
