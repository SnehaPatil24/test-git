package collection;

public class Test {
	public void m1() {
		m2();
		System.out.println("I am in m1");

	}

	public void m2() {
		System.out.println("I am in m2");
	}
	
public static void main(String[] args) {
		
		Test obj = new Test();
		obj.m1();
		System.out.println("I am in main method");
	}

	
}
