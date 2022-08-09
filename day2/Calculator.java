package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		cal.add(5, 5);
		cal.sub(10, 5);
		cal.multiplication(5, 5);
		cal.divition(25, 5);
	}


public void add(int a, int b) {
	
	System.out.println(a+b);
	
}

public void sub(int a, int b) {
	
	System.out.println(a-b);
	
}
public void multiplication(int a, int b) {
	
	System.out.println(a*b);
	
}
public void divition(int a, int b) {
	
	System.out.println(a/b);
	
}
}