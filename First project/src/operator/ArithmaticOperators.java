package operator;

public class ArithmaticOperators {
public static void main(String[] args) {
		
		ArithmaticOperators obj=new ArithmaticOperators();
		obj.add(2, 3);
		obj.sub(3, 1);
		obj.multi(2, 4);
		ArithmaticOperators.division(5f, 2);
		ArithmaticOperators.modulus(5);
		int va1=5;


	}
	
	// This is for +  Arithmetic Operators 
	public void add(int a,int b) {
		
		System.out.println("This is + operator test" + (a+b));
		
	}
	// This is for - Arithmetic operator
	public void sub(int a, int b) {
		System.out.println("This is - operator test" + (a-b));
		
	}
	// This is for * Arithmetic operator
	public void multi(int a, int b) {
		System.out.println("This is * operator test" + (a*b));
	}
	// This is for / Arithmetic operator
	public static void division(float a ,int b) {
		System.out.println("This is / operator test " + (a/b));
	}
	
	// This is for % Arithmetic operator
	public static void modulus(int a) {
		System.out.println("This is % operator test" + (a%2));
	}
	
}
