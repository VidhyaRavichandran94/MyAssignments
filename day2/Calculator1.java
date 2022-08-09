package week1.day2;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator1 cal = new Calculator1();
		int addition = cal.add(5, 5);
		int subtra = cal.sub(10, 5);
		int multi = cal.multiplication(5, 5);
		float divi = cal.divition(25, 5);

		System.out.println(addition);
		System.out.println(subtra);
		System.out.println(multi);
		System.out.println(divi);
	}
	public int add(int a, int b) {
		return a+b;
	}

	public int sub(int a, int b) {
		return a-b;
	}
	public int multiplication(int a, int b) {
		return a*b;
	}
	public float divition(int a, int b) {
		return a/b;
	}
}