package Exception;

public class Exception_FirstClass {
	static int[] a;

	public static void main(String[] args) {// main-caller method
		Exception_FirstClass obj = new Exception_FirstClass();
		obj.m1();// calling method
		System.out.println("I am back in main");

	}

	public void m1() { // m1-caller method
		m2();// calling method
		System.out.println("I am back in m1");
	}

	public void m2() {
		//
		System.out.println("I am m2");
		
		try {
			System.out.println(10 / 0);// Arithmatic
		} 
		catch(ArithmeticException e) {
			System.out.println("i am in catch block");
		}
		// It will create Exception Object ---line 20
		// Type of exception ,short description and location
		// Object is handover to JVM
		// JVM first will check whether exception handling code is written
		// in the method where exception occur --M2
	}
}
