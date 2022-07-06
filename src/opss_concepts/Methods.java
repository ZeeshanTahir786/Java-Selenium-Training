package opss_concepts;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods md = new Methods();
		
		md.doThis();
		md.addition(100, 200);
		int result = md.multiply(2, 10);
		
		System.out.println(result);
		
		
		md.add(1, 2);
		md.add(2.2, 1.8);
		md.add(1, 2, 3);
		md.add(5, 6.5);
	}
	
	
	public void doThis() {
		System.out.println("DO this execution");
	}
	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public int multiply(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
	}
	
//	===================================
//	METHOD OVERLOADING
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(double num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	
//	=====================================

	
	
	
}
